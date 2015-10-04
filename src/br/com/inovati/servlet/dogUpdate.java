package br.com.inovati.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.inovati.BO.CachorroBO;
import br.com.inovati.beans.CachorroBean;

/**
 * Servlet implementation class dogUpdate
 */
@WebServlet("/dogUpdate")
public class dogUpdate extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static CachorroBO bo = new CachorroBO();

	public dogUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("# entrou no service de dogupdate");
		if (request.getParameter("cachorro") == null) {
			doGet(request, response);
		} else {
			// cria um Cachorro
			CachorroBean cachorro = new CachorroBean();

			// Peg ao id que vem do botao
			int idCachorro = Integer.parseInt(request.getParameter("cachorro"));

			System.out.println("cachorro eh " + idCachorro); ////////////////////////////////////////////

			// Busca esse cachorro no banco
			try {
				cachorro = bo.getCachorro(idCachorro);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Seta os atributos do cachorro na request
			request.setAttribute("nome", cachorro.getNome());
			request.setAttribute("idade", cachorro.getIdade());
			request.setAttribute("raca", cachorro.getRaca());
			request.setAttribute("status", cachorro.getStatus());

			// request.setAttribute("cachorro", idCachorro);
			HttpSession session = request.getSession();
			session.setAttribute("cachorro", idCachorro);

			System.out.println("peguei o cachorro \n" + cachorro); //////////////////////////////////////////////

			request.getRequestDispatcher("dogUpdate.jsp").forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//cria um atributo da session
		HttpSession session = request.getSession();
		
		System.out.println("# entrou no doGet do dogUpdate"); ////////////////////////////////

		//cria um Cachorro
		CachorroBean cachorro = new CachorroBean();
		
		//seta os atributos do cachorro
		cachorro.setId( (int) session.getAttribute("cachorro"));
		cachorro.setNome(request.getParameter("nome"));
		cachorro.setIdade(Integer.parseInt(request.getParameter("idade")));
		cachorro.setRaca(request.getParameter("raca"));
		cachorro.setStatus(request.getParameter("status"));
		
		
		// Executa atualizacao
		try {
			bo.atualizaCachorro(cachorro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//volta pra home
		request.getRequestDispatcher("Home").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
