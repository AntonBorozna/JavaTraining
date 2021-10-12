package edu.java.training.chapter14.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {

	private PrintStream printStream;
	private BufferedReader reader;
	private InetAddress address;

	public ServerThread(Socket socket) {
		try {
			printStream = new PrintStream(socket.getOutputStream());
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		address = socket.getInetAddress();
	}

	private void disconnect() {
		if (printStream != null) {
			printStream.close();
		}
		try {
			if (reader != null) {
				reader.close();
			}
			System.out.println(address.getHostName() + ": disconnected");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			while (reader.readLine() != null) {
				printStream.println(address.getHostName() + ": disconnected");
				System.out.println("Connection from " + address.getHostName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
