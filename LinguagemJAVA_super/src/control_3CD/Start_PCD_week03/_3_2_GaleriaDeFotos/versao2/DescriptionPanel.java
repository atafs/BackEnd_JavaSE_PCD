package control_3CD.Start_PCD_week03._3_2_GaleriaDeFotos.versao2;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class DescriptionPanel extends JPanel{
	
	private JLabel jlblImageTitle = new JLabel();
	private JTextArea jtaDescription = new JTextArea();
	
	
	public DescriptionPanel() {
		
		jlblImageTitle.setHorizontalAlignment(JLabel.CENTER);
		jlblImageTitle.setHorizontalTextPosition(JLabel.CENTER);
		jlblImageTitle.setVerticalTextPosition(JLabel.BOTTOM);
		
		jlblImageTitle.setFont(new Font("SansSerif", Font.BOLD, 16));
		jtaDescription.setFont(new Font("Serif", Font.PLAIN, 18));
		
		jtaDescription.setLineWrap(true);
		jtaDescription.setWrapStyleWord(true);
		jtaDescription.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(jtaDescription);
		
		setLayout(new BorderLayout(5,5));
		add(scrollPane, BorderLayout.CENTER);
		add(jlblImageTitle, BorderLayout.WEST);
	} 
	
	public void setTitle(String title) {
		jlblImageTitle.setText(title);
	}
	
	public void setImageIcon(ImageIcon icon) {
		jlblImageTitle.setIcon(icon);
	}
	
	public void setDescription(String text) {
		jtaDescription.setText(text);
	}
	

}
