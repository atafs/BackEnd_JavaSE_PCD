package pt.progJava.americoLib.control70;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Start_sAPPLET_04_loadAudioPlay_control70 extends JApplet{
	
	//ATTRIBUTES
	private AudioClip sound1, sound2, currentSound;
	private JButton playButton, loopButton, stopButton;
	@SuppressWarnings("rawtypes")
	private JComboBox soundJComboBox;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void init() {
		setLayout(new FlowLayout());
		
		String[] choices = { "Welcome", "Hi"};
		soundJComboBox = new JComboBox(choices);
		
		//ANONYMOUS INNER CLASS
		soundJComboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				currentSound.stop();
				currentSound = soundJComboBox.getSelectedIndex() == 0 ? sound1 : sound2;
			}
		});
		
		add(soundJComboBox); //add to applet
		
		ButtonHandler handler = new ButtonHandler();
		
		//create play button
		playButton = new JButton("Play");
		playButton.addActionListener(handler);
		add(playButton);
		
		//create loop button
		loopButton = new JButton("Loop");
		loopButton.addActionListener(handler);
		add(loopButton);
		
		//create stop button
		stopButton = new JButton("Stop");
		stopButton.addActionListener(handler);
		add(stopButton);
		
		//load sounds and set currentSound
		sound1 = Applet.newAudioClip(this.getClass().getResource("sound/sound01.wav"));
		sound2 = Applet.newAudioClip(this.getClass().getResource("sound/sound02.wav"));
		currentSound = sound1;
	}
	
	//stop sound
	public void stop() {
		currentSound.stop();
	}
	
	//INNER CLASS
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == playButton) {
				currentSound.play();
			}
			else if(e.getSource() == loopButton) {
				currentSound.loop();

			}
			else if(e.getSource() == stopButton) {
				currentSound.stop();

			}
		}
		
	}

}
