package br.com.inovati.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.inovati.beans.UsuarioBean;
import br.com.inovati.connection.ConnectionFactory;

public class UsuarioDAO {
	
	private Connection conexao;
	
	//abreConexao
	private void abreConexao(){
		try {
			this.conexao = new ConnectionFactory().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gravaUsuario(UsuarioBean usuario) throws SQLException{
		System.out.println("usuario Recebido no DAO" + usuario.getNome() + usuario.getEmail() + usuario.getSenha());
		//Abre conexão
		abreConexao();		
		
		//prepara string de insert
		String sql = "INSERT INTO T_NAC_USUARIO (DS_NOME, DS_EMAIL, DS_SENHA) VALUES (?,?,?)";
		
		PreparedStatement query = conexao.prepareStatement(sql);
		
		query.setString(1, usuario.getNome());
		query.setString(2, usuario.getEmail());
		query.setString(3, usuario.getSenha());
		
		
		//executa query
		query.execute();
		System.out.println("-----> Usuario inserido com sucesso no banco!");
		
		//Fecha conexão e recursos
		query.close();
		conexao.close();
	}
	
	public void atualizaUsuario (UsuarioBean usuario) throws SQLException{
		String sql ="UPDATE T_NAC_USUARIO SET DS_NOME=?, DS_EMAIL=? WHERE CD_CODIGO=?";
		
		//Abre conexão
		abreConexao();
		PreparedStatement query = conexao.prepareStatement(sql);
		
		query.setString(1, usuario.getNome());
		query.setString(2, usuario.getEmail());
		query.setInt(3, usuario.getId());
		
		//executa query
		query.execute();
		System.out.println("-----> Usuario atualizado com sucesso no banco!");
		
		//Fecha conexão e recursos
		query.close();
		conexao.close();
	}
}
