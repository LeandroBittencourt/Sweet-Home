package br.com.inovati.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inovati.BO.UsuarioBO;
import br.com.inovati.beans.UsuarioBean;

/**
 * Servlet implementation class novoUsuario
 */
@WebServlet("/novoUsuario")
public class novoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UsuarioBO bo = new UsuarioBO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public novoUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entrou no doPost de novoUsuario");
		try {
			bo.gravaUsuario(preencheUsuario(request));
		} catch (Exception e) {
			System.out.println("Erro ao chamar o metodo gravausuario da bo");
			e.printStackTrace();
		}

		// volta pra home
		request.getRequestDispatcher("Home").forward(request, response);
	}

	private UsuarioBean preencheUsuario(HttpServletRequest request) {
		UsuarioBean usuario = new UsuarioBean();
		usuario.setEmail(request.getParameter("email"));
		usuario.setNome(request.getParameter("nome"));
		usuario.setSenha(request.getParameter("senha"));
		return usuario;
	}
}
