package pt.progJava.americoLib.control110;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Gui_start_control110 {

	//ATTRIBUTES
	private JFrame window = new JFrame();
	
	private JButton addButton = new JButton("ADD ");
	private JButton removeButton = new JButton("REMOVE");
	private JButton searchButton = new JButton("SEARCH");
	
	private JLabel areaOfExibitionImages = new JLabel();
	
	@SuppressWarnings("rawtypes")
	private DefaultListModel names_Files = new DefaultListModel();
	@SuppressWarnings("rawtypes")
	private DefaultListModel images_Files = new DefaultListModel();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JList list = new JList(names_Files);
	
	private Listener listener = new Listener();
	
	//@SuppressWarnings("unused")
	//private HashSet<String> phone = new HashSet<>();
	@SuppressWarnings("unused")
	private HashMap<String, HashSet<Integer>> ListPhones = new HashMap<>(); //VERY USEFUL TO SEARCH FROM KEY


	
	//CONSTRUCTOR
	public Gui_start_control110() {
		
		//CONFIGURE WINDOW
		window.setSize(600,600);
		window.setTitle("MY PHONE LIST - ISCTE");
		window.setLocation(200,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(new BorderLayout());
		
		//ADD COMPONENTS
		window.getContentPane().add(panelOfList(), BorderLayout.NORTH);
		
		areaOfExibitionImages.setSize(200,200);
		areaOfExibitionImages.setForeground(Color.GREEN);
		areaOfExibitionImages.setHorizontalAlignment(JLabel.LEFT);
		window.getContentPane().add(areaOfExibitionImages, BorderLayout.CENTER);
		window.getContentPane().add(panelOfButtons(), BorderLayout.SOUTH);
		
	}
	
	public void showWindow() {
		window.setVisible(true);
	}
	
	private JPanel panelOfList() {
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add(new JLabel("Phone List Names: "), BorderLayout.NORTH);
		panel.add(new JScrollPane(list), BorderLayout.CENTER);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(-1);
		list.setLayoutOrientation(JList.VERTICAL);
		
		list.addListSelectionListener(listener);
		
		return panel;
	}
	
	private JPanel panelOfButtons() {
		JPanel panel = new JPanel(new GridLayout(1,2));
		
		addButton.setForeground(Color.GREEN);
		addButton.setBackground(Color.BLACK);
		
		removeButton.setForeground(Color.RED);
		removeButton.setBackground(Color.BLACK);
		
		searchButton.setForeground(Color.BLUE);
		searchButton.setBackground(Color.BLACK);

		
		panel.add(addButton);
		panel.add(removeButton);
		panel.add(searchButton);
		
		addButton.addActionListener(listener);
		removeButton.addActionListener(listener);
		searchButton.addActionListener(listener);

		return panel;
	}
	
	@SuppressWarnings("unchecked")
	private void insertNewPhoneInList() {
		String nameOfPhone = JOptionPane.showInputDialog(window, "Name of Phone:", "[iName]: name", JOptionPane.QUESTION_MESSAGE);
		String numberOfPhone = JOptionPane.showInputDialog(window, "Number of Phone:", "[iPhone]: number", JOptionPane.QUESTION_MESSAGE);

		
		if(nameOfPhone != null && nameOfPhone.length() > 0 && numberOfPhone != null && numberOfPhone.length() > 0) {
		
			names_Files.addElement(nameOfPhone);
			images_Files.addElement(numberOfPhone);
			
			//SELECT the element that was just inserted
			list.setSelectedIndex(list.getModel().getSize() -1);
			
		} else {
			//ERROR MESSAGE
			JOptionPane.showMessageDialog(window, "NAME OF FILE INVALID", "[iPhoto]: error", JOptionPane.ERROR_MESSAGE);
		}	
	}
	
	//INNER CLASS
	class Listener implements ActionListener, ListSelectionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == addButton) {
				insertNewPhoneInList();
			} else if(e.getSource() == removeButton) {
				
				//VERIFY that an item is selected
				if(list.getSelectedIndex() == -1) {
					//ERROR MESSAGE
					JOptionPane.showMessageDialog(window, "NOTHING WAS SELECTED", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					images_Files.remove(list.getSelectedIndex());
					names_Files.remove(list.getSelectedIndex());
				}
			} else if(e.getSource() == searchButton) {
				JOptionPane.showMessageDialog(window, "STILL TO IMPLEMENT", "IN PROGRESS", JOptionPane.OK_CANCEL_OPTION);
			}
		}
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
			
			//VERIFY that an item is selected
			if(-1 < list.getSelectedIndex()) {
				
				//CHOOSE image to show
				areaOfExibitionImages.setText((String) images_Files.getElementAt(list.getSelectedIndex()));
				
			} else {
			
				//SELECT NEW TEXT
				areaOfExibitionImages.setText(new String("PHONE NOT SELECTED"));
			}
		}	
	}	
}


