package day10.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerSocketClass {
	
	ServerSocket serverSocket = null;
	Socket socket = null;
	PrintWriter writer;
	BufferedReader reader = null;
	String lineStr;		//Client�� �Է�
	
	public ServerSocketClass() {
		
		try {
			
			//��Ʈ��ȣ ����. �������� �����
			serverSocket = new ServerSocket(2000);
			
			while(true) {
				//clinet�� ��û ���
				socket = serverSocket.accept();
				System.out.println("Client ��û");
				
				writer = new PrintWriter(socket.getOutputStream(),true);	//���� �غ�
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));	//�б� �غ�
				
				while((lineStr = reader.readLine())!= null) {	//�о�� ���� null�� �ƴѰ��
					writer.write(lineStr);	//���Ͽ� ����?
					System.out.println("Client�� input : "+lineStr);
				}
				
				writer.close();
				reader.close();
				socket.close();
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void main(String[] args) {
		new ServerSocketClass();
	}
	
	
	

}