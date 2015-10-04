package br.com.inovati.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inovati.BO.CachorroBO;
import br.com.inovati.beans.CachorroBean;

@WebServlet("/dogCadastro")
public class dogCadastro extends HttpServlet {

	// Serial Version Para naum gerar Warning
	private static final long serialVersionUID = 1L;

	// BO da Servlet
	private static CachorroBO bo = new CachorroBO();

	// Construtor
	public dogCadastro() {
		super();
	}

	// Metodo DOGET
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	// Metodo DOPOST
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			bo.gravaCachorro(preencheCachorro(request));
			response.sendRedirect("http://localhost:8080/Sweet_Home/Home");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Metodo PREENCHECACHORRO
	private CachorroBean preencheCachorro(HttpServletRequest request) {
		CachorroBean cachorro = new CachorroBean();

		cachorro.setIdade(Integer.parseInt(request.getParameter("idade")));
		cachorro.setNome((request.getParameter("name")));
		cachorro.setRaca((request.getParameter("raca")));
		cachorro.setPrevAdocao((request.getParameter("prevAdocao")));

		return cachorro;
	}

}
