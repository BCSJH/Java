package Lab3;
import java.util.Scanner;

public class Lab33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է��� �л��� ������ŭ �� ��� ���α׷�
		System.out.println("===============");
		System.out.println("201704007 ������");
		System.out.println("===============");

		int student;//�л� ��
		Scanner in =new Scanner(System.in);

		System.out.println("�Է��� �л��� ���� �Է����ּ���");
		student=in.nextInt();//�Է�
		
		while(student<=0)//0������ ���� �Է����� ���
		{
			in.nextLine();//���۰� ����
			System.out.println("�߸��� ���Դϴ�. �ٽ� �Է����ּ���.");
			System.out.println("�Է��� �л��� ���� �Է����ּ���");
			student=in.nextInt();//�ٽ��Է��ϱ� ����
		}
		
				int student_user[]=new int[student];//�迭 ����
				System.out.println(student+"���� ���α׷��� ������ �Է����ּ���. (0~100)");//�ȳ���
				for(int i=0; i<student;i++)
				{
						//�Է� �ް� ���� ����ŭ ���� �Է��ϰ� �迭�� ����
						System.out.print((i+1)+":");
						//�迭�� 0���� ���������� �Է��ϴ� ���� 1���� ��µǾ� �ϹǷ� +1����
						student_user[i]=in.nextInt();//�Է¹ޱ�
						
						while(student_user[i]<0 || student_user[i]>100)//0~100������ ���� �ƴ� ���
						{
							in.nextLine();//���۰� ����
							System.out.println("�߸��� ���Դϴ�. �ٽ� �Է����ּ���.");
							System.out.print((i+1)+":");
							student_user[i]=in.nextInt();//�Է¹ޱ�
						}
						
				}
				System.out.println("���");
				for(int i=0;i<student;i++)//��� ���
				{
					int score=student_user[i]/10;
					if(student_user[i]<20&&student_user[i]>=0)//0~19 ���� ���� 1�� ��µǾ��ϹǷ�
					{
						score=1;
					}
					else //������ ��� try�� ������ �������ٵ�...
						System.out.print("");
					System.out.println((i+1)+":"+student_user[i]+"�� : ");
					
					for(int s=0; s<score ;s++)//����(*)���
					{
						System.out.print("*");
					}
					System.out.println("");
				}
				
	
	}
}
