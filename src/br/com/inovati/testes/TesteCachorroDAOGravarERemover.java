package br.com.inovati.testes;

import java.sql.SQLException;

import br.com.inovati.beans.CachorroBean;
import br.com.inovati.dao.CachorroDAO;

public class TesteCachorroDAOGravarERemover {
	
	public static void main(String[] args) throws SQLException {
		
		
		CachorroDAO cachorro = new CachorroDAO();
		
		CachorroBean c = new CachorroBean();
		
		c.setIdade(45);
		c.setNome("rex");
		c.setPrevAdocao("12/45/8888");
		c.setRaca("poodle");
		c.setStatus("adotado");
		
		
		//GRAVANDO CACHORRO
		
		cachorro.gravarCachorro(c);
		
		
		//EXCLUINDO CACHORRO
		cachorro.excluirCachorro(11);
	
	}

}
