package br.com.inovati.testes;

import java.sql.SQLException;

import br.com.inovati.beans.CachorroBean;
import br.com.inovati.dao.CachorroDAO;

public class TesteCachorroDAOAtualizaCachorro {

	public static void main(String[] args) throws SQLException {

		CachorroBean cachorro = new CachorroBean("ALTENENCIO", 71, "PASTOR", "22/55/7845", "ADOTADO");
		
		cachorro.setId(18);

		new CachorroDAO().atualizaCachorro(cachorro);
		
	}

}
