package br.com.inovati.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inovati.BO.CachorroBO;
import br.com.inovati.beans.CachorroBean;

/**
 * Servlet implementation class dogUpdate
 */
@WebServlet("/dogUpdate")
public class dogUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static CachorroBO bo = new CachorroBO();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dogUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	int dogId = Integer.parseInt(request.getParameter("dog"));
    	CachorroBean dog = new CachorroBean();
    	try {
			dog = bo.getCachorro(dogId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	request.setAttribute("nome", dog.getNome());
    	request.setAttribute("idade", dog.getIdade());
    	request.setAttribute("raca", dog.getRaca());
    	request.setAttribute("status", dog.getStatus());
    	
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
