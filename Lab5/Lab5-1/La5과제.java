
import java.util.InputMismatchException;
import java.util.Scanner;

public class La5���� {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 ������");
		System.out.println("================");
		System.out.println("Music player");
		
		Music[] Music = new Music[3];//�迭�� �����ϱ� ����
		int userInt;//����ڷκ��� � �޴��� �������� �Է¹ް� �ϱ� ����
		Scanner user = new Scanner(System.in);
		
		String song;
		int day;
		String singer;
		
		do{//����ڷκ��� �Է¹��� �޴��� 1,2,0�� ���� ������ �ٽ� �Է��ϰ� �ϱ� ����

			System.out.println("1.���Ǹ���Ʈ   2.�����߰�   0.������");
			userInt=user.nextInt();//�޴� �Է�
			
		switch(userInt)
		{
		case 1: {
				try {
					System.out.println("���Ǹ���Ʈ");
					for(int i=0;i<3;i++)
						Music[i].result();//��� ���
				}
				catch(Exception e){
					System.out.println("����� �����ϴ�.");
				}
				break;
			}
		case 2: {
				for(int i=0;i<3;i++) {//�Է�
					System.out.println((i+1)+"�뷡���� : ");
					song=user.next();
					System.out.println("���� : ");
					singer=user.next();
					System.out.println("�߸��� :");
					day=user.nextInt();
					Music[i]= new Music(song, singer, day);
					}
				break;
			}
		case 0: {//�ý��� ����
				System.out.println("�ý��� ����");
				return ;
			}
			default ://�̻��Ѱ� �Է����� ��
				System.out.println("1,2,0���� �Է����ּ���!");
				user.nextLine();

			}
		}while(userInt!=0);//���Ḧ �Է��Ҷ����� �ݺ�
		
	}

}
