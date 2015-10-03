package br.com.inovati.BO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.inovati.beans.CachorroBean;
import br.com.inovati.dao.CachorroDAO;
import br.com.inovati.exception.GeneralException;

public class CachorroBO {

	// dao do bo
	private CachorroDAO dao = new CachorroDAO();

	// metodo listaCachorros ALL
	public List<CachorroBean> listaCachorros() throws Exception {
		return dao.getAll();
	}

	// metodo listaCachorro SOH UM
	public CachorroBean getCachorro(int id) throws Exception {
		CachorroBean cachorro = dao.getCachorro(id);
		if (cachorro == null)
			throw new Exception("Cachorro não encontrado");
		return cachorro;
	}

	// metodo atualiza UM Cachorro
	public boolean atualizaStatus(int id, String status) throws Exception {
		try {
			dao.atualizaStatus(status, id);
		} catch (Exception e) {
			throw new Exception("Falha ao atualizar o status.");
		}
		return false;
	}

	// metodo grava Cachorro
	public void gravaCachorro(CachorroBean cachorro) throws Exception {
		if (podeCriar(cachorro)) {
			dao.gravarCachorro(cachorro);
		} else {
			throw new GeneralException("Cachorro nao pode ser criado! - Erro no metodo gravaCachorro de BO");
		}
	}

	// metodo exclui um Cachorro
	public boolean excluiCachorro(int id) throws Exception {
		try {
			dao.excluirCachorro(id);
		} catch (Exception e) {
			throw new Exception("Falha ao excluir cachorro");
		}
		return false;
	}

	// metodo atualiza um cachorro
	public CachorroBean atualizaCachorro(CachorroBean cachorro) throws Exception {
		try {
			dao.atualizaCachorro(cachorro);
		} catch (Exception e) {
			throw new Exception("Falha ao atualizar o cachorro");
		}
		return cachorro;
	}

	// metodo que verifica se pode criar
	private boolean podeCriar(CachorroBean cachorro) {
		if (cachorro.getNome() != null && cachorro.getNome().length() > 3) {
			return true;
		} else {
			return false;
		}
	}
}
