package test;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 ������");
		System.out.println("================");
	    System.out.print("�̸��� �Է����ּ���: ");//�ȳ���
	    Scanner user = new Scanner(System.in);
	    //���� ���� ���� �̸� user�� �Է��ϴ� ���̶�� �����־���.
	    //Ű���� �Է��� ���� scanner
	    String name = user.nextLine();//���ڿ��� �Է¹޴´�.
	    
	    System.out.print(name+"�� �а��� �Է����ּ���: ");//�ȳ���
	    String mager = user.nextLine();//���ڿ��� �Է¹޴´�.
	    
	    System.out.println("------������ �Է����ּ���----------");//ĭ�� �Ҹ�
	    
	    System.out.print("����: ");//�ȳ���
	    int K = user.nextInt();//������ ���� �Է¹޴´�
	    
	    System.out.print("����: ");//�ȳ���
	    int E = user.nextInt();//������ ���� �Է¹޴´�
	    
	    System.out.print("����: ");//�ȳ���
	    int M = user.nextInt();//������ ���� �Է¹޴´�
	    
	    System.out.println("--------------���-----------");
	    System.out.println("�̸�: "+name+", �а�: "+mager);
	    System.out.println("����: "+(K+E+M));//������
	    System.out.print("���: ");
	    System.out.printf("%.2f" ,(K+E+M)/3F);//������, F�� �߰� ���ϸ� ������ ���.
	}
	
}
