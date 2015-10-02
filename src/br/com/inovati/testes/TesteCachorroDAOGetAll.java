package br.com.inovati.testes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.inovati.beans.CachorroBean;
import br.com.inovati.dao.CachorroDAO;

public class TesteCachorroDAOGetAll {
	
	public static void main(String[] args) throws SQLException {
		
		CachorroDAO dao = new CachorroDAO();
		
		List<CachorroBean> lista = new ArrayList<CachorroBean>();
		
		lista = dao.getAll();
		
		System.out.println(lista);
		
	}

}
