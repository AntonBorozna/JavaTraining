package edu.java.training.chapter14.chat;

/*
 * Чат. Сервер рассылает всем клиентам информацию о клиентах, вошедших
 * в чат и покинувших его
 */

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServerThreadMain {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(4004);
			System.out.println("Server connected!");
			while (true) {
				Socket socket = serverSocket.accept();
				PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				writer.println(socket.getInetAddress().getHostName() + " connected");
				writer.flush();
				ServerThread thread = new ServerThread(socket);
				thread.start();
			}
		} catch (Exception e) {
			System.err.print(e);
		}
	}
}
