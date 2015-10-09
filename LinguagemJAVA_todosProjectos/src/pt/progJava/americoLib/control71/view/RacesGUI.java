package pt.progJava.americoLib.control71.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pt.progJava.americoLib.control71.control.CarroThread;

@SuppressWarnings("serial")
public class RacesGUI extends JFrame implements ActionListener {

	/* attributes */
	private JButton btnCorrida;
	private JButton btnCancel;
	private JButton btnRestart;
	private JLabel lblPista;
	private JLabel lblVelocimetro;
	private ImageIcon imgCarro1;
	private ImageIcon imgCarro2;
	private ImageIcon imgCarro3;
	private ImageIcon pista;
	private ImageIcon velocimetro;
	
	/* constructor */
 	public RacesGUI() {
 		super();
 		//iniciar a minha janela com todas as definicoes
 		init();
 	}

	//iniciar a minha janela com todas as definicoes
	private void init() {
		
		//adicionar elementos
		this.setLayout(null);
		this.setSize(1280,650);
		this.setLocation(50,50);
		this.setResizable(false);
		getContentPane().setBackground(Color.GRAY);
		
		this.setTitle("CORRIDA ISCTE!!!!");
		this.velocimetro = new ImageIcon("./src/pt/progJava/americoLib/control71/imagens/velocimetro.jpg");
		this.pista = new ImageIcon("./src/pt/progJava/americoLib/control71/imagens/pista.png");
		
		this.lblPista = new JLabel(pista);
		this.lblVelocimetro = new JLabel(velocimetro);
		
		//posicionamento dos elementos
		this.lblVelocimetro.setBounds(200, 490, 150, 150);
		this.lblPista.setBounds(0, 0, 1280, 650);
		
		this.add(lblPista);
		this.lblPista.add(lblVelocimetro);
		
		this.lblPista.setBackground(Color.black);
		
		this.btnCorrida = new JButton("Start ISCTE Rally");
		this.btnCancel = new JButton("End ISCTE Rally");
		this.btnRestart = new JButton("ReStart ISCTE Rally");
	
		//posicionar os botoes
		this.btnCorrida.setBounds(500, 500, 170, 70);
		this.btnCancel.setBounds(900, 500, 170, 70);
		this.btnRestart.setBounds(700, 500, 170, 70);
		
		//inserir imagens
		imgCarro1 = new ImageIcon("./src/pt/progJava/americoLib/control71/imagens/carro1.png");
		imgCarro2 = new ImageIcon("./src/pt/progJava/americoLib/control71/imagens/carro2.png");
		imgCarro3 = new ImageIcon("./src/pt/progJava/americoLib/control71/imagens/carro3.png");
		
		this.lblPista.add(btnCorrida);
		this.lblPista.add(btnCancel);
		this.lblPista.add(btnRestart);
		
		setVisible(true);
		
		//adicionar listeners
		btnCorrida.addActionListener(this);
		btnCancel.addActionListener(this);
		btnRestart.addActionListener(this);
		
		JPanel jpanel = new JPanel();
		jpanel.setSize(300,70);
		jpanel.setLayout(null);
		jpanel.setLocation(970, 510);
		jpanel.setBorder(BorderFactory.createTitledBorder("[Grupo de Trabalho]"));
		jpanel.setVisible(true);
		
		this.repaint();
		this.validate();
	
	}

	
	//inserindo as JLabel dos carros
	public JLabel jLabelCarros(String nome, ImageIcon img, int posX, int posY) {
		CarroThread carro = new CarroThread(nome, img, posX, posY);
		carro.setSize(256, 141);
		carro.setVisible(true);
		this.add(carro);
		return carro;
	}
	
	//listeners
	@Override
	public void actionPerformed(ActionEvent dispara) {
		
		//listener: start
		if(dispara.getSource() == this.btnCorrida) {
			this.lblPista.add(jLabelCarros("Carro1", imgCarro1, 0, 50));
			this.lblPista.add(jLabelCarros("Carro2", imgCarro2, 0, 200));
			this.lblPista.add(jLabelCarros("Carro3", imgCarro3, 0, 350));
			
			this.repaint();
			this.validate();
		}
		
		//listener: cancel
		if(dispara.getSource() == this.btnCancel) 			
			System.exit(0); 
		

		//listener: reStart
		if(dispara.getSource() == this.btnRestart) 
			
			this.lblPista.repaint();
			this.lblPista.validate();

		
		
		
		
		
	}
}
