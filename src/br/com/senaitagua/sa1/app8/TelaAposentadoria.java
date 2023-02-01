package br.com.senaitagua.sa1.app8;
import java.awt.FlowLayout;

import javax.swing.*;


public class TelaAposentadoria extends JFrame{ 

	JLabel titulo;
	JButton btnGravar,btnLer,btnLimpar;
	JTextArea txtArea;
	
	public TelaAposentadoria() {
		super("Aplicativo 8");
		getContentPane().setLayout(new FlowLayout());
		titulo = new JLabel("aplicativo 8 - Aposentadoria do Piloto");
		btnGravar = new JButton("Gravar");
		btnLer = new JButton("Ler");
		btnLimpar = new JButton("Limpar");
		txtArea = new JTextArea(5,10);
		getContentPane().add(titulo);
		getContentPane().add(txtArea);
		getContentPane().add(btnGravar);
		getContentPane().add(btnLer);
		getContentPane().add(btnLimpar);
		setSize(800,600);
		
	}

}