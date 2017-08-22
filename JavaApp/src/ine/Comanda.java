package ine;

import java.util.ArrayList;

public class Comanda {
	
	public Comanda(String nomeCliente, double valorTotal, Usuario usuarioAbertura, ArrayList<Pedido> pedidos,
			Estado estado, long id) {
		super();
		this.nomeCliente = nomeCliente;
		this.valorTotal = valorTotal;
		UsuarioAbertura = usuarioAbertura;
		this.pedidos = pedidos;
		this.estado = estado;
		this.id = id;
	}
	
	protected String nomeCliente;
	protected double valorTotal;
	protected Usuario UsuarioAbertura;
	protected ArrayList<Pedido> pedidos;
	protected Estado estado;
	protected long id;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Usuario getUsuarioAbertura() {
		return UsuarioAbertura;
	}
	public void setUsuarioAbertura(Usuario usuarioAbertura) {
		UsuarioAbertura = usuarioAbertura;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
