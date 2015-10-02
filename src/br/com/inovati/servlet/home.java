package br.com.inovati.servlet;

import java.io.IOException;
import java.util.List;

import javax.jws.soap.InitParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inovati.BO.CachorroBO;
import br.com.inovati.beans.CachorroBean;

/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public List<CachorroBean> dogs;
    private CachorroBO bo = new CachorroBO();
	
    public home() {
        super();
    }
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	try {
        	dogs = bo.listaCachorros();
        	System.out.println(dogs);
        	request.setAttribute("dogs", dogs);
        	
        	request.getRequestDispatcher("home.jsp").forward(request, response);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
