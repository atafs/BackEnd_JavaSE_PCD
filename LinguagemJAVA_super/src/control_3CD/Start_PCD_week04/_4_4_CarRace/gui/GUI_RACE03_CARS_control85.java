package control_3CD.Start_PCD_week04._4_4_CarRace.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import control_3CD.Start_PCD_week04._4_4_CarRace.graphic.Pista;
import control_3CD.Start_PCD_week04._4_4_CarRace.thread.Carro;


public class GUI_RACE03_CARS_control85 {

	
	//ATTRIBUTES
	private JFrame janela;
	private Pista pista;
	private JButton start;
	private static final int NUMBER_CARS = 4;
	
	//CONSTRUCTOR
	public GUI_RACE03_CARS_control85() {
	
		janela = new JFrame("CORRIDA");
		janela.setSize(1100,700);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pista = new Pista();
		start = new JButton("START");
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= NUMBER_CARS; i++) {
					new Carro(pista, i).start();
				}
				start.setEnabled(false);
			}
		});
		
		janela.getContentPane().setLayout(new BorderLayout());
		janela.getContentPane().add(pista, BorderLayout.CENTER);
		janela.getContentPane().add(start, BorderLayout.SOUTH);
		
		janela.setVisible(true);
	}
	
}
