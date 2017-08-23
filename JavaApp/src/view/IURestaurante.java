package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ine.Usuario;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class IURestaurante extends JFrame implements LoginListener {

	 protected JLabel loginLabel;
	    protected JLabel senhaLabel;
	    protected JTextField loginArea;
	    protected JButton logarBotao;
	    protected JPanel painelDir, painelEsq;
	    protected JLabel loginMsg;
	    protected Usuario usuario;
	    private JPasswordField passwordField;
	    private JLabel lblDigiteASenha;
	    
	    public IURestaurante(){
	        super("Tela de Login");
	        setResizable(false);
	        this.setSize(600, 400);
	        
	        this.loginLabel = new JLabel("Digite o login");
	        this.senhaLabel = new JLabel("Digite a senha");
	        
	        this.loginArea = new JTextField(10);
	        
	        this.logarBotao = new JButton("Entrar");
	        this.logarBotao.addActionListener(new ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                handler(evt);
	            }
	        });
	        
	        this.painelDir = new JPanel(new FlowLayout());
	        this.painelDir.add(this.loginLabel);
	        this.painelDir.add(this.loginArea);
	        
	        lblDigiteASenha = new JLabel("Digite a senha");
	        painelDir.add(lblDigiteASenha);

	        
	        this.passwordField = new JPasswordField();
	        passwordField.setColumns(10);
	        this.painelDir.add(this.passwordField);
	        this.painelDir.add(this.logarBotao);
	        
	        this.loginMsg = new JLabel("");
	        this.painelEsq = new JPanel(new FlowLayout());
	        this.painelEsq.add(this.loginMsg);
	        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	        
	        getContentPane().add(this.painelDir);
	        getContentPane().add(this.painelEsq);
	        this.show();
	        
	        this.usuario = new Usuario();
	        this.usuario.addListener(this);
	    }
	    
	    private void handler(java.awt.event.ActionEvent evt) {                         
	        this.usuario.logar(this.loginArea.getText(), this.passwordField.getText());
	    }
	




	@Override
	public void loginRealizado(LoginEvent e) {
        if(e.isResultadoLogin())
            this.loginMsg.setText("Seja bem-vindo");
        else
            this.loginMsg.setText("Login ou senha incorretos");
    }
}
