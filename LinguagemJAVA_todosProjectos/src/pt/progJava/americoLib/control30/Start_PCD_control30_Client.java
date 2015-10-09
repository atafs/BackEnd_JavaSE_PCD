package pt.progJava.americoLib.control30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Start_PCD_control30_Client {
	
	public static void main(String[] args) {
		
		Start_PCD_control30_Client client = new Start_PCD_control30_Client();
		client.run();
	}
	
	public void run() {
		

		
		try {
			
			/*socket*/
			@SuppressWarnings("resource")
			Socket socket = new Socket("localhost", 444);
			PrintStream printOutput = new PrintStream(socket.getOutputStream());
			printOutput.println("CLIENT: HELLO to SERVER from CLIENT");
			
			/*reader*/
			InputStreamReader readInput = new InputStreamReader(socket.getInputStream());
			BufferedReader bufferInput = new BufferedReader(readInput);
			
			/*print*/
			String message = bufferInput.readLine();
			//System.out.println(message);
			JOptionPane.showMessageDialog(null, message, "SERVER", JOptionPane.INFORMATION_MESSAGE);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
