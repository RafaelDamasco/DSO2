package ine;

import java.util.ArrayList;

public class Comanda {
	
	protected String nomeCliente;
	protected double valorTotal;
	protected Usuario UsuarioAbertura;
	protected ArrayList<Pedido> pedidos;
	protected Estado estado;
	protected long id;
}
