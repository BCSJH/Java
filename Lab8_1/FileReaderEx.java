import java.io.*;
import java.util.Scanner;
public class FileReaderEx { 
	public static void main(String[] args) { 
		System.out.println("===============");
		System.out.println("201704007 김정현");
		System.out.println("===============");
		Scanner kbd = new Scanner(System.in);
		FileWriter fout = null;
		InputStreamReader in = new InputStreamReader(System.in);
		InputStreamReader inn = null; 
		FileInputStream fin = null;

		//파일입력
		System.out.println("파일 이름을 쓰세요: (ex: test.txt)");
		String file= kbd.nextLine();
		try { 
			fout = new FileWriter(file); 
			int c; 
			
			System.out.println("파일에 넣을 내용을 추가하세요");
			while ((c = in.read()) != -1) { 
				// 한 문자씩 읽기
				fout.write(c);				
				} 
			in.close();
			fout.close();
			// 파일로부터 문자 입력 스트림 생성 
			in.close();  		
			}catch (IOException e) { //예외처리
				System.out.println("입출력 오류"); 
				}
		
		try { 
		fin = new FileInputStream(file); 
		inn = new InputStreamReader(fin, "MS949");//한글 확장, 완성형 문자 집합
		int cc;
		while ((cc = inn.read()) != -1) {//한 문자씩 읽기
			System.out.print((char)cc); 
			} 
		inn.close(); 
		fin.close(); 
		} catch (IOException e) { System.out.println("입출력 오류"); }

		} 
	}