/**
 * 
 */
package ����;

import java.util.Scanner;

/**
 * @author jeonghyun
 *
 */
public class ����3 {
	public static void main(String[] args) {
		
// 1���� 9 ������ ���� �Է� �޾� ���ĺ����� �ﰢ�� �׸��� 
		System.out.println("=============");
		System.out.println("201704007 ������");
		System.out.println("=============");
		int a =0;//do while�� ������ ���� ó���� �Է¹޾ƾ��ϴ� a���� 0���� ����
		
		do {
			System.out.printf("1~9 ���ڸ� �Է����ּ���! (�������� 0)");//�ȳ���
			Scanner scanner = new Scanner(System.in);
			a=scanner.nextInt();//���ĺ��Է� �ޱ�
			if(a>=0&&a<10)//1~9������ ��
			{
			
			for (int i=0, count=1;i<a;++i,count+=2) {
				char ch='a';//�Ƕ�̵� ù��° ������ A
				for(int j=0;j<a-i;j++) {//�Ƕ�̵带 ����� ���� �����̽��� ����
					System.out.print(" ");
				}
				for(int j=0;j<count;j++) {//�����Ҷ����� ���ĺ� ���
					if(ch>'Z') {//Z���� Ŭ ��츦 �־���
						ch='A';
					}
					System.out.print(ch++);//���ĺ� ������� ���
				}
			
			System.out.println();//���� �ٷ� �Ѿ�� ����
				}
			}
			else//�߸��Է�������
			{
			System.out.println("�߸��Է��߽��ϴ�.");
			scanner.nextLine();//���۰� ����
			}
		
		}while(a!=0);//0�Է��ϸ� ����
			System.out.println("����");

}
}
