package pt.progJava.americoLib.control89;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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


public class Gui_SWING_JList01 {

	//ATTRIBUTES
	private JFrame window = new JFrame();
	
	private JButton addButton = new JButton("+");
	private JButton removeButton = new JButton("-");
	
	private JLabel areaOfExibitionImages = new JLabel();
	
	@SuppressWarnings("rawtypes")
	private DefaultListModel names_Files = new DefaultListModel();
	@SuppressWarnings("rawtypes")
	private DefaultListModel images_Files = new DefaultListModel();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JList list = new JList(names_Files);
	
	private Listener listener = new Listener();

	
	//CONSTRUCTOR
	public Gui_SWING_JList01() {
		
		//CONFIGURE WINDOW
		window.setSize(600,600);
		window.setLocation(200,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(new BorderLayout());
		
		//ADD COMPONENTS
		window.getContentPane().add(panelOfList(), BorderLayout.NORTH);
		
		areaOfExibitionImages.setSize(200,200);
		areaOfExibitionImages.setHorizontalAlignment(JLabel.CENTER);
		window.getContentPane().add(areaOfExibitionImages, BorderLayout.CENTER);
		window.getContentPane().add(panelOfButtons(), BorderLayout.SOUTH);
		
	}
	
	public void showWindow() {
		window.setVisible(true);
	}
	
	private JPanel panelOfList() {
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add(new JLabel("IMAGES: "), BorderLayout.NORTH);
		panel.add(new JScrollPane(list), BorderLayout.CENTER);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(-1);
		list.setLayoutOrientation(JList.VERTICAL);
		
		list.addListSelectionListener(listener);
		
		return panel;
	}
	
	private JPanel panelOfButtons() {
		JPanel panel = new JPanel(new GridLayout(1,2));
		
		panel.add(addButton);
		panel.add(removeButton);
		
		addButton.addActionListener(listener);
		removeButton.addActionListener(listener);

		return panel;
	}
	
	@SuppressWarnings("unchecked")
	private void insertNewFileInList() {
		String nameOfFile = JOptionPane.showInputDialog(window, "Name of File:", "[iPhoto]: file", JOptionPane.QUESTION_MESSAGE);
		
		if(nameOfFile != null && nameOfFile.length() > 0) {
			//ImageIcon image = new ImageIcon(nameOfFile);
			ImageIcon image = new ImageIcon(this.getClass().getResource("foto/" + nameOfFile + ".jpg"));
			
			names_Files.addElement(nameOfFile);
			images_Files.addElement(image);
			
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
				insertNewFileInList();
			} else if(e.getSource() == removeButton) {
				
				//VERIFY that an item is selected
				if(list.getSelectedIndex() == -1) {
					//ERROR MESSAGE
					JOptionPane.showMessageDialog(window, "NOTHING WAS SELECTED", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					images_Files.remove(list.getSelectedIndex());
					names_Files.remove(list.getSelectedIndex());
				}
			}
		}
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
			
			//VERIFY that an item is selected
			if(-1 < list.getSelectedIndex()) {
				
				//CHOOSE image to show
				areaOfExibitionImages.setIcon((ImageIcon)images_Files.getElementAt(list.getSelectedIndex()));
				
				//REMOVE TEXT
				areaOfExibitionImages.setText(null);
			} else {
			
				//REMOVE IMAGE
				areaOfExibitionImages.setIcon(null);
				
				//SELECT NEW TEXT
				areaOfExibitionImages.setText(new String("IMAGE NOT SELECTED"));
			}
		}	
	}	
}


