import java.io.*;
import java.util.Scanner;
public class FileReaderEx { 
	public static void main(String[] args) { 
		System.out.println("===============");
		System.out.println("201704007 ������");
		System.out.println("===============");
		Scanner kbd = new Scanner(System.in);
		FileWriter fout = null;
		InputStreamReader in = new InputStreamReader(System.in);
		InputStreamReader inn = null; 
		FileInputStream fin = null;

		//�����Է�
		System.out.println("���� �̸��� ������: (ex: test.txt)");
		String file= kbd.nextLine();
		try { 
			fout = new FileWriter(file); 
			int c; 
			
			System.out.println("���Ͽ� ���� ������ �߰��ϼ���");
			while ((c = in.read()) != -1) { 
				// �� ���ھ� �б�
				fout.write(c);				
				} 
			in.close();
			fout.close();
			// ���Ϸκ��� ���� �Է� ��Ʈ�� ���� 
			in.close();  		
			}catch (IOException e) { //����ó��
				System.out.println("����� ����"); 
				}
		
		try { 
		fin = new FileInputStream(file); 
		inn = new InputStreamReader(fin, "MS949");//�ѱ� Ȯ��, �ϼ��� ���� ����
		int cc;
		while ((cc = inn.read()) != -1) {//�� ���ھ� �б�
			System.out.print((char)cc); 
			} 
		inn.close(); 
		fin.close(); 
		} catch (IOException e) { System.out.println("����� ����"); }

		} 
	}