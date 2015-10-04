package br.com.inovati.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inovati.BO.CachorroBO;

@WebServlet("/dogRemove")
public class dogRemove extends HttpServlet {
	
	private static CachorroBO bo = new CachorroBO();
	
	private static final long serialVersionUID = 1L;

	public dogRemove() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("# Entrou no service de dogRemove");

		// exclui o cachorro
		try {
			bo.excluiCachorro(Integer.parseInt( request.getParameter("cachorro")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//volta pra home
		request.getRequestDispatcher("Home").forward(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
