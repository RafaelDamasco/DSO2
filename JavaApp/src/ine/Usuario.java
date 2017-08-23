package ine;

import java.util.ArrayList;
import java.util.List;

import view.LoginEvent;
import view.LoginListener;

public class Usuario implements ILogar{
	
	protected String nome;
	protected long id;
	protected Tipo tipo;
	protected String username;
	protected String password;
    protected List<LoginListener> listeners;

	public Usuario() {
		super();
		this.username = "oi";
		this.password = "oi";
        this.listeners = new ArrayList<>();
	}



	@Override
	public void logar(String username, String password) {
		this.fireLoginEvent(this.username.equals(username) && this.password.equals(password));
	}
	
	@Override
	public void addListener(LoginListener listener){
        this.listeners.add(listener);
	}

	private void fireLoginEvent(boolean resultadoLogin) {
		for(LoginListener listener : this.listeners)
            listener.loginRealizado(new LoginEvent(this, resultadoLogin));	
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
