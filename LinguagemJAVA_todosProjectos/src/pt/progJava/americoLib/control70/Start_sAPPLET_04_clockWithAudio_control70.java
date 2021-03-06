package pt.progJava.americoLib.control70;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Start_sAPPLET_04_clockWithAudio_control70 extends JApplet{

	/*ATTRIBUTES -------------------------------------------------------------------*/
	//create hourAudio and minuteAudio
	protected AudioClip[] hourAudio = new AudioClip[12];
	protected AudioClip[] minuteAudio = new AudioClip[60];
	
	//create audio am e pm
	protected AudioClip pmAudio = Applet.newAudioClip(getClass().getResource("sound/sound01.wav"));
	protected AudioClip amAudio = Applet.newAudioClip(getClass().getResource("sound/sound02.wav"));

	//create clock
	private StillClock clock = new StillClock();
	
	//create timer
	private Timer timer = new Timer(1000, new TimerListener());
	
	//create label to display time
	private JLabel jlblDigitTime = new JLabel("", JLabel.CENTER);
	
	/*METHODS -----------------------------------------------------------------------*/
	//initialize the Applet
	public void init() {
		
		//create audio clips for pronouncing hours
		for (int i = 0; i < 4; i++) {
			System.out.println("hour: " + i);
			hourAudio[i] = Applet.newAudioClip(this.getClass().getResource("sound/sound0" + i + ".wav"));
		}
		
		//create audio clips for pronouncing minutes
		for (int i = 0; i < 4; i++) {
			System.out.println("minutes: " + i);
			minuteAudio[i] = Applet.newAudioClip(this.getClass().getResource("sound/sound0" + i + ".wav"));
		}
		
		//add clock and time label
		add(clock, BorderLayout.CENTER);
		add(jlblDigitTime, BorderLayout.SOUTH);
	}
	
	//override applet start method
	public void start() {
		timer.start(); //resume clock
	}
	
	//override applet stop method
	public void stop() {
		timer.stop(); //suspend clock
	}
	
	//INNER class Listenner
	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			clock.setCurrentTime();
			clock.repaint();
			
			jlblDigitTime.setText(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());
			
			if(clock.getSecond() == 0) {
				announceTime(clock.getHour(), clock.getMinute());
			}
		}
	}
	
	//announce the current time for every minute
	public void announceTime(int hour, int minute) {
		//announce hour
		hourAudio[hour % 12].play();
		
		try {
			//time delay to allow hourAudio to finish
			Thread.sleep(1500);
			
			minuteAudio[minute].play();
			
			//time delay to allow minuteAudio to finish
			Thread.sleep(1500);

		} catch (Exception e) {
		}
		
		//announce am or pm
		if(hour < 12) {
			amAudio.play();
		}
		else {
			pmAudio.play();
		}
	}
	
	  public static void main(String[] args) {
		  Start_sAPPLET_04_clockWithAudio_control70 applet = new Start_sAPPLET_04_clockWithAudio_control70();
		  applet.init();
		  applet.start();
		  JFrame frame = new JFrame();
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setTitle("ClockWithAudio");
		  frame.getContentPane().add(applet, BorderLayout.CENTER);
		  frame.setSize(400, 320);
		  frame.setVisible(true);
	  }
}
