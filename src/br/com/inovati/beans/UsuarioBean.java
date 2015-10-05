package br.com.inovati.beans;

public class UsuarioBean {
	
	private String nome;
	private String email;
	private String senha;
	private int idade;
	private int id;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdade() {

		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id){
		this.id =id;
	}

	public UsuarioBean (String nome, String email, String senha, int idade){
		super();
		this.email=email;
		this.nome=nome;
		this.senha=senha;
		this.idade=idade;
	}
	
	public UsuarioBean () {
		super();
	}
}
