package day10.URLConnection;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class URLConnectionClass {
	
	public URLConnectionClass() {
		
		String code = null;
		System.out.println("����ȭ �� �ּҸ� �Է��Ͻÿ�");	//https://www.naver.com/�̰� �Է�����.
		Scanner scanner = new Scanner(System.in);
		
		String address = scanner.next();
		
		try {
			
			URL url = new URL(address);	//url��ü�� �ּ� �Է�
			URLConnection con = url.openConnection();	//�ּҿ� ����
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));	//�ּ��� ������ �о����
			FileWriter writer = new FileWriter("C:\\GitHub\\testhtml.html",false);
				
			//�ش� �ּ��� �ҽ��� �� ���üҽ��� ������ ����� �Ȱ��� �����Ѱ�.
			//��ġ ũ�Ѹ��� ���ٰ� �����ұ�?
			while((code = reader.readLine()) != null) {
				writer.write(code);
			}
			System.out.println("The end");
			
			writer.close();
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}