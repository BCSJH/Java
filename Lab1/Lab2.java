package test;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 ������");
		System.out.println("================");
	      System.out.println("���� �Է����ּ���: ");//�ȳ���
	      Scanner user = new Scanner(System.in);
	      //���� ���� ���� �̸� user�� �Է��ϴ� ���̶�� ���صξ���.
	      //Ű���� �Է��� ���� scanner
	      int money = user.nextInt();//���� ���� ���ڿ��� �Է¹޴´�
	      
	      System.out.println("============���============");//ĭ�� �и�
	      
	      //������ ���� ���ϴ� ��
	      int M50000 = (money/50000);//5����
	      int M10000 = ((money%50000)/10000);//1����
	      int M5000 = ((money%50000%10000)/5000);//5õ��
	      int M1000 = ((money%50000%10000%5000)/1000);//1õ��
	      int M500 = ((money%50000%10000%5000%1000)/500);//500��
	      int M100 = ((money%50000%10000%5000%1000%500)/100);//100��
	      int M=(money%100);//������ ���̱� ������ %�� �־��־���
	      
	      //����� ���
	      System.out.println("50000��: "+M50000+"��");
	      System.out.println("10000��: "+M10000+"��");
	      System.out.println("5000��: "+M5000+"��");
	      System.out.println("1000��: "+M1000+"��");
	      System.out.println("500��: "+M500+"��");
	      System.out.println("100��: "+M100+"��");
	      System.out.println("��Ÿ: "+M+"��");
	}
}
