package br.com.inovati.BO;

import java.sql.SQLException;

import br.com.inovati.beans.UsuarioBean;
import br.com.inovati.dao.UsuarioDAO;

public class UsuarioBO {
	private UsuarioDAO dao = new UsuarioDAO();
	
	public void gravaUsuario(UsuarioBean usuario) throws SQLException{
		try {
			dao.gravaUsuario(usuario);
		} catch (Exception e) {
			System.out.println("Erro no gravausuario do bo");
			e.printStackTrace();
		}
	}
}
