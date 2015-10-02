package br.com.inovati.BO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.inovati.beans.CachorroBean;
import br.com.inovati.dao.CachorroDAO;

public class CachorroBO {
	private CachorroDAO dao = new CachorroDAO();
	
	public List<CachorroBean> listaCachorros () throws Exception{
		return dao.getAll();
	}
	
	public CachorroBean getCachorro(int id) throws Exception{
		CachorroBean cachorro = dao.getCachorro(id);
		if(cachorro==null)throw new Exception("Cachorro não encontrado");
		return cachorro;
	}
	
	public boolean atualizaStatus(int id, String status) throws Exception{
		try {
			dao.atualizaStatus(status, id);
		} catch (Exception e) {
			throw new Exception("Falha ao atualizar o status.");
		}
		return false;
	}
	
	public void gravaCachorro(CachorroBean cachorro) throws Exception{
		System.out.println("entrou no gravaCachorro do BO");
			if(podeCriar(cachorro));
				dao.gravarCachorro(cachorro);
	}
	
	public boolean excluiCachorro(int id) throws Exception{
		try {
			dao.excluirCachorro(id);
		} catch (Exception e) {
			throw new Exception("Falha ao excluir cachorro");
		}
		return false;
	}
	
	public CachorroBean atualizaCachorro(CachorroBean cachorro) throws Exception{
		try {
			dao.atualizaCachorro(cachorro);
		} catch (Exception e) {
			throw new Exception("Falha ao atualizar o cachorro");
		}
		return cachorro;
	}
	
	private boolean podeCriar(CachorroBean cachorro){
		System.out.println("entrou no pode criar");  ////////////////////
		if(cachorro.getNome()!=null){
			if(cachorro.getNome().length()>3){
				
			}
		}else if (cachorro.getRaca()!=null){
			if(cachorro.getRaca().length()>3){
				
			}
		}
		return false;
	}
}
