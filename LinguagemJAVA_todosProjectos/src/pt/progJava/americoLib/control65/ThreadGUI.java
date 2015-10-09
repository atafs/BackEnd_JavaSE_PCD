package pt.progJava.americoLib.control65;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ThreadGUI extends JFrame implements ActionListener {

	/* *********************atributos****************************** */

	// constantes
	@SuppressWarnings("unused")
	private static final int CAVALOS = 3;
	// tipo de componentes
	private JButton botao;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;

	// classes associadas a Thread
	@SuppressWarnings("unused")
	private MyThread myThread;

	/* ***********************construtor**************************** */
	public ThreadGUI() {
		super("************ ISCTE CORRIDAS************** ");

		/* inicializar os objectos */
		botao = new JButton("START!!!");
		texto1 = new JTextField();
		texto2 = new JTextField();
		texto3 = new JTextField();

		/* vincular botoes (eventos) */
		botao.addActionListener(new BotaoListener());

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
				"fotos/cavalo1.jpg"));
		ImageIcon foto2 = new ImageIcon(getClass().getResource(
				"fotos/cavalo2.jpg"));
		ImageIcon foto3 = new ImageIcon(getClass().getResource(
				"fotos/cavalo3.jpg"));

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
		painelDeStart.add(botao);

		/* coloco o painelDosBotoes dentro do painel */
		painel.add(painelDeImagens);
		painel.add(painelDeStart);

		// personalizar o mostrador
		texto1.setBackground(Color.GREEN);
		texto1.setFont(new Font("Arial", Font.PLAIN, 18));
		texto1.setHorizontalAlignment(JTextField.CENTER);
		texto1.setEditable(false);// Disable editing
		texto1.setText("//...em construcao");

		texto2.setBackground(Color.BLUE);
		texto2.setFont(new Font("Arial", Font.PLAIN, 18));
		texto2.setHorizontalAlignment(JTextField.CENTER);
		texto2.setText("//...em construcao");

		texto3.setBackground(Color.YELLOW);
		texto3.setFont(new Font("Arial", Font.PLAIN, 18));
		texto3.setHorizontalAlignment(JTextField.CENTER);
		texto3.setText("//...em construcao");

		c.add(painel, BorderLayout.CENTER);

		/* instrucoes finais da janela */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocation(50, 50);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ThreadGUI();
	}

	/* criar outra class: trata dos eventos do botao ok */
	class BotaoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("//...prestes a comecar...");
			
			/* definir novo texto em branco */
			texto1.setText("30");
			texto2.setText("30");
			texto3.setText("30");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
