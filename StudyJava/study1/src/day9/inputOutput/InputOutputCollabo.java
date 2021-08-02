package day9.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputCollabo {	//����� ���ÿ� �ϴ� Ŭ����!
	
	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
		is = new FileInputStream("C:\\GitHub\\testInOut.txt");
		os = new FileOutputStream("C:\\GitHub\\testInOut_copy.txt");
		
		while(true) {
			int i = is.read();	// 1byte�� �б� (byte[5] �̰Ÿ� 5byte�� ��������.)
			System.out.println(i);
			if(i == -1) break;
			os.write(i);		// ������� �Է��ϱ�.	 (write(byte[5],int,int) �̷� ���̸� �迭�� ��� ������ ���� �ڸ� ���ִ� �����.)
		}
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		} finally {
			try {
				if(is != null) is.close();
				if(os != null) os.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}