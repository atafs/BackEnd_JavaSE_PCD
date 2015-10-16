package control_3CD.Start_PCD_week04._4_2_CorridaDeCavalosSimulada.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control_3CD.Start_PCD_week04._4_2_CorridaDeCavalosSimulada.thread.MyThread;

@SuppressWarnings("serial")
public class GUI_RACE03_HORSES_control84 extends JFrame {

	/* *********************atributos****************************** */
	// constantes
	@SuppressWarnings("unused")
	private static final int CAVALOS = 3;
	// tipo de componentes
	private JButton update;
	private JButton start;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;

	// classes associadas a Thread
	//private static Start_SWING_horseRACE03_control84 horseRace = new Start_SWING_horseRACE03_control84();
	private static final int NUM_THREADS = 3;// 3 cavalos
	private static ArrayList<MyThread> threads = new ArrayList<MyThread>();

	//GETTERS
	public int getNumThreads() {
		return NUM_THREADS;
	}

	public void setThreads(ArrayList<MyThread> threads) {
		GUI_RACE03_HORSES_control84.threads = threads;
	}
	
	public ArrayList<MyThread> getThreads() {
		return threads;
	}
	
	public int getMyThreadCounter(int i) {
		return threads.get(i).getCounterThread();
	}
	
	/* ***********************construtor**************************** */
	public GUI_RACE03_HORSES_control84() {
		super("************ ISCTE CORRIDAS************** ");

		/* inicializar os objectos */
		update = new JButton("UPDATE POSITION!!!");
		start = new JButton("START RACE!!!");
		texto1 = new JTextField();
		texto2 = new JTextField();
		texto3 = new JTextField();

		/* vincular botoes (eventos) */
		update.addActionListener(new BotaoListener());
		start.addActionListener(new BotaoListener());

		/* criar label com uma mensagem (quando passo o rato por cima) */
		JLabel simples = new JLabel("Corrida de Cavalos");
		simples.setToolTipText("Meu Tooltip");

		/* criar label com variantes de cor, letra, tamanho,... */
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("CORRIDA DE CAVALOS");
		label.setFont(fonte);
		label.setForeground(Color.GREEN);

		/* criar label com imagem */
		ImageIcon foto1 = new ImageIcon(getClass().getResource(
				"/control_3CD/Start_PCD_week04/_4_2_CorridaDeCavalosSimulada/fotos/cavalo1.jpg"));
		ImageIcon foto2 = new ImageIcon(getClass().getResource(
				"/control_3CD/Start_PCD_week04/_4_2_CorridaDeCavalosSimulada/fotos/cavalo2.jpg"));
		ImageIcon foto3 = new ImageIcon(getClass().getResource(
				"/control_3CD/Start_PCD_week04/_4_2_CorridaDeCavalosSimulada/fotos/cavalo3.jpg"));

		JLabel imagem1 = new JLabel(foto1);
		JLabel imagem2 = new JLabel(foto2);
		JLabel imagem3 = new JLabel(foto3);

		/* definido o Container e o que esta dentro */
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		/* JPanel principal: inicializo um painel do tipo JPanel */
		JPanel painel = new JPanel();

		/* JPanel secundario: tipo GridLayout */
		JPanel painelDeImagens = new JPanel();
		painelDeImagens.setLayout(new GridLayout(3, 3));

		/* coloco o painelDosBotoes dentro do painel */
		painel.add(painelDeImagens);

		painelDeImagens.add(imagem1);
		painelDeImagens.add(texto1, BorderLayout.SOUTH);
		painelDeImagens.add(imagem2);
		painelDeImagens.add(texto2, BorderLayout.SOUTH);
		painelDeImagens.add(imagem3);
		painelDeImagens.add(texto3, BorderLayout.SOUTH);

		/* JPanel secundario: tipo GridLayout */
		JPanel painelDeStart = new JPanel();
		painelDeStart.setLayout(new GridLayout(3, 3));
		painelDeStart.add(simples);
		painelDeStart.add(label);
		painelDeStart.add(update);

		/* coloco o painelDosBotoes dentro do painel */
		painel.add(painelDeImagens);
		painel.add(painelDeStart);

		// personalizar o mostrador
		texto1.setBackground(Color.GREEN);
		texto1.setFont(new Font("Arial", Font.PLAIN, 18));
		texto1.setHorizontalAlignment(JTextField.CENTER);
		texto1.setEditable(false);// Disable editing
		texto1.setText("//...prestes a comecar");

		texto2.setBackground(Color.BLUE);
		texto2.setFont(new Font("Arial", Font.PLAIN, 18));
		texto2.setHorizontalAlignment(JTextField.CENTER);
		texto2.setText("//...prestes a comecar");

		texto3.setBackground(Color.YELLOW);
		texto3.setFont(new Font("Arial", Font.PLAIN, 18));
		texto3.setHorizontalAlignment(JTextField.CENTER);
		texto3.setText("//...prestes a comecar");

		c.add(painel, BorderLayout.CENTER);
		c.add(update, BorderLayout.SOUTH);
		c.add(start, BorderLayout.NORTH);

		/* instrucoes finais da janela */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 550);
		setLocation(50, 50);
		setResizable(true);
		setVisible(true);
	}



	/* criar outra class: trata dos eventos do botao ok */
	class BotaoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
					
			if(arg0.getSource() == start) {
				for (int i = 0; i < 3; i++) {
					// iniciar a thread
					threads.get(i).start();
				}
			}
			
			else if(arg0.getSource() == update) {	
				/* definir novo texto em branco */
				texto1.setText(threads.get(0).getCounterThreadString());
				texto2.setText(threads.get(1).getCounterThreadString());
				texto3.setText(threads.get(2).getCounterThreadString());
				
				texto1.repaint();
				texto1.validate();				
			}
		}
	}
}
