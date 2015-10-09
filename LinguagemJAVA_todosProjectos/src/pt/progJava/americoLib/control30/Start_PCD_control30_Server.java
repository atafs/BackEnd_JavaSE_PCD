package pt.progJava.americoLib.control30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Start_PCD_control30_Server {
	
	public static void main(String[] args) {
	
		Start_PCD_control30_Server server = new Start_PCD_control30_Server();
		server.run();
	}

	public void run() {
		
	
		try {
			
			/*instantiate server socket*/
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(444);
			Socket socket = serverSocket.accept();
			
			/*reader*/
			InputStreamReader readInput = new InputStreamReader(socket.getInputStream());
			BufferedReader bufferInput = new BufferedReader(readInput);
			
			/*writer*/
			String message = bufferInput.readLine();
			//System.out.println(message);
			JOptionPane.showMessageDialog(null, message, "Info CLIENT", JOptionPane.INFORMATION_MESSAGE);

			
			/*final print*/
			if(message != null) {
				PrintStream printOutput = new PrintStream(socket.getOutputStream());
				//printOutput.println("MESSAGE received");
				JOptionPane.showMessageDialog(null, "MESSAGE received", "SERVER:", JOptionPane.INFORMATION_MESSAGE);
				printOutput.println("SERVER: That is it for today ;-)");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
