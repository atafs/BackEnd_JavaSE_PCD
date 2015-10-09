package pt.progJava.americoLib.control70;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class StillClock extends JPanel{
	
	//ATTRIBUTES ----------------------------------------
	private int hour;
	private int minute;
	private int second;
	
	//CONSTRUCTOR ---------------------------------------
	public StillClock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public StillClock() {
		setCurrentTime();
	}

	//GETTERS AND SETTERS ---------------------------------
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		repaint();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		repaint();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		repaint();
	}
	
	//METHODOS ---------------------------------------------
	
	//draw a clock
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//initialize clock parameters
		int clockRadius = (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		//draw circle
		g.setColor(Color.BLACK);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
		g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
		g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
		g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
		g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);

		//draw second hand
		int sLength = (int)(clockRadius * 0.8);
		
		int xSecond = (int)(xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
		int ySecond = (int)(yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
		g.setColor(Color.red);
		g.drawLine(xCenter, yCenter, xSecond, ySecond);
		
		//draw minute hand
		int mLength = (int)(clockRadius * 0.65);
		int xHour = (int)(xCenter + mLength * Math.sin(minute) * (2 * Math.PI / 60));
		int yHour = (int)(yCenter - mLength * Math.cos(minute) * (2 * Math.PI / 60));
		g.setColor(Color.green);
		g.drawLine(xCenter, yCenter, xHour, yHour);
	}
	
	//
	public void setCurrentTime() {
		
		//construct calender for current minute and second
		Calendar calender = new GregorianCalendar();
		
		//set current hour, minute and second
		this.hour = calender.get(Calendar.HOUR_OF_DAY);
		this.minute = calender.get(Calendar.MINUTE);
		this.second = calender.get(Calendar.SECOND);
	}
	
	public Dimension getPreferrdSize() {
		return new Dimension(200,200);
	}
	
}
