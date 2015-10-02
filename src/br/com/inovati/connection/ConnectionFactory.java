package br.com.inovati.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.inovati.exception.GeneralException;

public class ConnectionFactory 
{
	public  Connection getConnection() throws GeneralException, ClassNotFoundException
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("----------> Aberta uma conexao em ConnectionFactory!");
			return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL", "OPS$RM73791","230591");
		}catch(SQLException e){
			throw new GeneralException("Erro ao conectar o banco de dados");
		}
	}
}
