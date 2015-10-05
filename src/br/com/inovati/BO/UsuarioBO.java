package br.com.inovati.BO;

import java.sql.SQLException;

import br.com.inovati.beans.UsuarioBean;
import br.com.inovati.dao.UsuarioDAO;

public class UsuarioBO {
	private UsuarioDAO dao = new UsuarioDAO();

	public void gravaUsuario(UsuarioBean usuario) throws SQLException {
		try {
			dao.gravaUsuario(usuario);
		} catch (Exception e) {
			System.out.println("Erro no gravausuario do bo");
			e.printStackTrace();
		}
	}

	public boolean login(String senhaForm, String email) {
		System.out.println("entrou no verifica senha/login");
		int id = 0;
		
		
		try {
			id = dao.getIDByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
		
		System.out.println("mostra o id buscando: "+id);
		
		
		String senha = null;
		
		
		try {
			senha = dao.getSenha(id);
		} catch (Exception e) {
			return false;
		}
		
		
		System.out.println("mostra a senha buscada: "+senha);
		System.out.println("mostra senhaform: "+ senhaForm);
		
		
		if (senhaForm.equals(senha))
			return true;
		return false;
	}
}
