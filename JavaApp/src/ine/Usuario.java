package ine;

public class Usuario {
	
	protected String nome;
	protected long id;
	protected Tipo tipo;
	protected String username;
	protected String password;

	public Usuario(String nome, long id, Tipo tipo, String username, String password) {
		super();
		this.nome = nome;
		this.id = id;
		this.tipo = tipo;
		this.username = username;
		this.password = password;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
