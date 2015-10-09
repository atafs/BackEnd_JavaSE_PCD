package pt.progJava.americoLib.control48;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Start_SWING_control48_JFrame03 extends JFrame {
	
	/* atributos */
	
	
	
	/* construtor */
	public Start_SWING_control48_JFrame03() {
		JButton botao = new JButton("BUTTON Adder");
		getContentPane().add(botao);
		
		/* Container principal da Janela */
		Container c = getContentPane();
		c.setLayout(new BorderLayout());//borderLayout
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(3,3));//gridLayout
		c2.add(new JButton("Button 1"));
		c2.add(new JButton("Button 2"));
		c2.add(new JButton("Button 3"));
		c2.add(new JButton("Button 4"));
		c2.add(new JButton("Button 5"));
		c2.add(new JButton("Button 6"));
		
		c2.setForeground(Color.GREEN);
		c2.setBackground(Color.BLACK);
		
		
		/* defino posicao e botao: Container principal */
		c.add(BorderLayout.NORTH, new JButton("Add new Button"));
		c.add(BorderLayout.CENTER, c2);
		
		c.setForeground(Color.GREEN);
		c.setBackground(Color.BLACK);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	
	/* outras rotinas */

	
	//validate()
	
	
	public static void main(String[] args) {
		
		/* chamar a janela aqui */
		new Start_SWING_control48_JFrame03();
	}
	
	
	
	
	

}
