package br.com.inovati.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inovati.BO.CachorroBO;
import br.com.inovati.beans.CachorroBean;

@WebServlet("/home")
public class Home extends HttpServlet {

	// Lista de Cachorros de Home
	public List<CachorroBean> dogs;

	// Cachorro BO de Home
	private CachorroBO bo = new CachorroBO();

	// Construtor de Home
	public Home() {
		super();
	}

	@Override
	// Metodo SERVICE
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			dogs = bo.listaCachorros();
			request.setAttribute("dogs", dogs);
			request.getRequestDispatcher("home.jsp").forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Metodo DOGET
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	// Metodo DOPOST
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
