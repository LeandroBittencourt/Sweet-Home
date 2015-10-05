package br.com.inovati.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public UsuarioBean getUsuario(int id) throws SQLException{
		String sql ="SELECT * FROM T_NAC_USUARIO WHERE CD_USUARIO=?";
		UsuarioBean usuario = new UsuarioBean();
		//abre conexão
		abreConexao();
		PreparedStatement query = conexao.prepareStatement(sql);
		
		query.setInt(1, id);
		
		ResultSet resultado = query.executeQuery();
		
		while(resultado.next()){
			usuario = preencheUsuario(resultado);
		}
		//Fecha conexão e recursos
		query.close();
		conexao.close();
		
		return usuario;
		
	}
	
	public int getIDByEmail (String email) throws SQLException{
		abreConexao();
		
		String sql = "SELECT CD_USUARIO FROM T_NAC_USUARIO WHERE DS_EMAIL=?";
		
		PreparedStatement query = conexao.prepareStatement(sql);
		
		query.setString(1, email);
		
		ResultSet resultado = query.executeQuery();
		
		int id=0;
		
		while(resultado.next()){
			id = resultado.getInt("CD_USUARIO");
		}
		
		//Fecha conexão e recursos
		query.close();
		conexao.close();
		return id;
	}
	
	public String getSenha(int id) throws SQLException{
		abreConexao();
		
		String sql = "SELECT DS_SENHA FROM T_NAC_USUARIO WHERE CD_USUARIO=?";
		
		PreparedStatement query = conexao.prepareStatement(sql);
		
		query.setInt(1, id);
		
		ResultSet resultado = query.executeQuery();
		String senha = null;
		while(resultado.next()){
			senha = resultado.getString("DS_SENHA");
		}
		
		
		//Fecha conexão e recursos
		query.close();
		conexao.close();
		
		return senha;
	}
	
	private UsuarioBean preencheUsuario (ResultSet dado) throws SQLException{
		UsuarioBean usuario = new UsuarioBean();
		usuario.setEmail(dado.getString("DS_EMAIL"));
		usuario.setNome(dado.getString("DS_NOME"));
		usuario.setId(dado.getInt("DS_EMAIL"));
		
		return usuario;
	}
}
