/**
 * 
 */
package ����;

import java.util.Scanner;

/**
 * @author jeonghyun
 *
 */
public class ����2 {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
			//���� ���� �Է¹޾� �¾ ���� ã��
		System.out.println("=============");
		System.out.println("201704007 ������");
		System.out.println("=============");
		System.out.println("��������� �Է����ּ���(ex:970101)");
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();//�Է¹���
		

		int length =str.length();//�Է¹��� ��������� ���̸� Ȯ���ϱ� ����
		
		if(length==6)//�Է��� ��������� ���̰� 6�϶� ����
		{
			str =str.substring(2,4);//�¾ ���� ���� ������ �˾Ƴ��� ����
			int month = Integer.parseInt(str);

		switch(month) {
		case 12: case 1: case 2://�ܿ�
			System.out.println("�ܿ￡ �¾�̱���");
			break;
		
		case 3: case 4: case 5://��
			System.out.println("���� �¾�̱���");
			break;
			
		case 6: case 7: case 8://����
			System.out.println("������ �¾�̱���");
			break;
		case 9: case 10: case 11://����
			System.out.println("������ �¾�̱���");
			break;
			}		
		}
		else//�߸��Է����� ��
			System.out.println("�� ������ �߸� �Ǿ����ϴ�.");	
			
	}
	
}
