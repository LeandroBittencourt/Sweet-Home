package br.com.inovati.dao;

import java.sql.Connection;

import br.com.inovati.connection.ConnectionFactory;

public class UsuarioDAO {
	
	private Connection conexao;
	
	//Construtor
	public UsuarioDAO(){
		try {
			this.conexao = new ConnectionFactory().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gravaUsuario(){
		String sql = "INSERT INTO T_NAC_USUARIO ()";
	}
}
