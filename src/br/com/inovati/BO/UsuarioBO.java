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
	
	public boolean login (String senhaForm, String email){
		int id;
		try {
			id = dao.getIDByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
		String senha = null;
		try {
			senha = dao.getSenha(id);
		} catch (Exception e) {
			return false;
		}
		if(senhaForm==senha)return true;
		return false;
	}
}
