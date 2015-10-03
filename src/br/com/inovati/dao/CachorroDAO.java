package br.com.inovati.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.inovati.beans.CachorroBean;
import br.com.inovati.connection.ConnectionFactory;

public class CachorroDAO {

	// connection atributo
	private Connection conexao;

	//abreconexao
	private void abreConexao(){
		try {
			this.conexao = new ConnectionFactory().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// metodo add
	public void gravarCachorro(CachorroBean cachorro) throws SQLException {
		
		//Abre conexao
		abreConexao();
		

		// String SQL
		String sql = "INSERT INTO T_NAC_CACHORRO (ds_nome, nr_idade, ds_raca, dt_prev_adocao, ds_status) VALUES (?,?,?,?,?)";

		// conexao faz o PreparedStatement
		PreparedStatement estrutura = conexao.prepareStatement(sql);

		// seta o PreparedStatement
		estrutura.setString(1, cachorro.getNome());
		estrutura.setInt(2, cachorro.getIdade());
		estrutura.setString(3, cachorro.getRaca());
		estrutura.setString(4, cachorro.getPrevAdocao());
		estrutura.setString(5, "DISPONIVEL");

		// executa a estrutura
		estrutura.execute();
		System.out.println("----------> CachorroDAO escreveu com sucesso um cachorro no banco!");
		
		//fecha conexoes e recursos
		estrutura.close();
		System.out.println("----------> Fechando conexao em CachorroDao.gravarCachorro() - " + conexao.hashCode());
		conexao.close();
	}

	// metodo de exclusao
	public void excluirCachorro(int id) throws SQLException {
		//Abre conexao
		abreConexao();

		// String SQL
		String sql = "DELETE FROM T_NAC_CACHORRO WHERE CD_CACHORRO = (?)";

		// conexao faz o preparedStatement
		PreparedStatement estrutura = conexao.prepareStatement(sql);

		// seta o prepared
		estrutura.setInt(1, id);

		// executa
		estrutura.execute();
		System.out.println("----------> CachorroDAO de id " + id + " foi removido do banco!");

		// fechando recursos
		estrutura.close();
		System.out.println("----------> Fechando conexao em CachorroDao.gravarCachorro() - " + conexao.hashCode());
		conexao.close();

	}

	// metodo que retorna toda a lista de cachorros
	public List<CachorroBean> getAll() throws SQLException {
		//Abre conexao
		abreConexao();

		// cria a lista de cachorros
		List<CachorroBean> lista = new ArrayList<CachorroBean>();

		// cria o PreparedStatement atraves da conexao
		PreparedStatement estrutura = this.conexao.prepareStatement("SELECT * FROM T_NAC_CACHORRO");

		// executando o PreparedStatement temos como resultado o ResultSet
		ResultSet resultadoDados = estrutura.executeQuery();

		// e entao o iteramos
		while (resultadoDados.next()) {

			// criando o objeto Cachorro
			CachorroBean cachorro = preencheCachorro(resultadoDados);

			// e salvando o objeto no ArrayList que serah retornado
			lista.add(cachorro);
		}

		// fechando recursos
		resultadoDados.close();
		estrutura.close();
		System.out.println("----------> Fechando conexao em CachorroDao.gravarCachorro() - " + conexao.hashCode());
		conexao.close();

		// retornando lista
		return lista;
	}

	public CachorroBean getCachorro(int id) throws SQLException {
		//Abre conexao
		abreConexao();

		// Prepara a query
		PreparedStatement estrutura = this.conexao
				.prepareStatement("SELECT * FROM T_NAC_CACHORRO WHERE CD_CACHORRO = (?)");

		// Atualiza o placeholder
		estrutura.setInt(1, id);

		// executa a query
		ResultSet resultadoDados = estrutura.executeQuery();

		CachorroBean cachorro = new CachorroBean();
		while (resultadoDados.next()) {
			cachorro = preencheCachorro(resultadoDados);
		}

		// fechando recursos
		resultadoDados.close();
		estrutura.close();
		System.out.println("----------> Fechando conexao em CachorroDao.gravarCachorro() - " + conexao.hashCode());
		conexao.close();

		return cachorro;
	}

	public void atualizaCachorro(CachorroBean cachorro) throws SQLException {
		
		//Abre conexao
		abreConexao();

		// String SQL
		String sql = "UPDATE T_NAC_CACHORRO SET DS_NOME=?, NR_IDADE=?, DS_RACA=?, DT_PREV_ADOCAO=?,DS_STATUS=? WHERE CD_CACHORRO = ?";

		// conexao faz o PreparedStatement
		PreparedStatement estrutura = conexao.prepareStatement(sql);

		// seta o PreparedStatement
		estrutura.setString(1, cachorro.getNome());
		estrutura.setInt(2, cachorro.getIdade());
		estrutura.setString(3, cachorro.getRaca());
		estrutura.setString(4, cachorro.getPrevAdocao());
		estrutura.setString(5, cachorro.getStatus());
		estrutura.setInt(6, cachorro.getId());

		// executa a estrutura
		estrutura.execute();
		System.out.println("----------> CachorroDAO alterou o cachorro de codigo " + cachorro.getId());

		// fechando recursos
		estrutura.close();
		System.out.println("----------> Fechando conexao em CachorroDao.gravarCachorro() - " + conexao.hashCode());
		conexao.close();

	}

	public void atualizaStatus(String status, int id) throws SQLException {
		
		//Abre conexao
		abreConexao();
		
		
		// SQL
		String sql = "UPDATE T_NAC_CACHORRO SET DS_STATUS=(?) WHERE CD_CACHORRO=(?)";

		// Prepara o statement
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		estrutura.setString(1, status);
		estrutura.setInt(2, id);

		estrutura.execute();
		System.out.println("----------> CachorroDAO alterou o status do cachorro: " + id + " para " + status);

		// fechando recursos
		estrutura.close();
		System.out.println("----------> Fechando conexao em CachorroDao.gravarCachorro() - " + conexao.hashCode());
		conexao.close();

	}

	private CachorroBean preencheCachorro(ResultSet dado) throws SQLException {
		CachorroBean cachorro = new CachorroBean();

		// setando seus atributos que estao vindo lah do banco
		cachorro.setIdade(dado.getInt("NR_IDADE"));
		cachorro.setNome(dado.getString("DS_NOME"));
		cachorro.setPrevAdocao(dado.getString("DT_PREV_ADOCAO"));
		cachorro.setRaca(dado.getString("DS_RACA"));
		cachorro.setStatus(dado.getString("DS_STATUS"));
		cachorro.setId(Integer.parseInt(dado.getString("CD_CACHORRO")));

		return cachorro;
	}

}
