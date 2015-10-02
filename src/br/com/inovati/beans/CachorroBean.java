package br.com.inovati.beans;

/*
cd_cachorro    NUMBER (10) NOT NULL ,
ds_nome        VARCHAR2 (100) ,
nr_idade       NUMBER (2) ,
ds_raca        VARCHAR2 (40) ,
dt_prev_adocao DATE ,
ds_status      VARCHAR2 (15) NOT NULL*/

public class CachorroBean {
	
	private int id;
	private String nome;
	private int idade;
	private String raca;
	private String prevAdocao;
	private String status;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPrevAdocao() {
		return prevAdocao;
	}

	public void setPrevAdocao(String prevAdocao) {
		this.prevAdocao = prevAdocao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CachorroBean(String nome, int idade, String raca, String prevAdocao, String status){
		super();
		this.nome=nome;
		this.idade=idade;
		this.raca=raca;
		this.prevAdocao=prevAdocao;
		this.status=status;
	}
	
	public CachorroBean(){
		super();
	}
	
	 public String toString() { 
		 String s = "";
		 s+="id: "+this.id+"\n";
		 s+="idade: "+this.idade+"\n";
		 s+="nome: "+this.nome+"\n";
		 s+="prevAdocao: "+this.prevAdocao+"\n";
		 s+="raca: "+this.raca+"\n";
		 s+="status: "+this.status+"\n";
         return s;
      }  
	
}
