package Lab3;
import java.util.Scanner;

public class Lab33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력한 학생의 점수만큼 별 찍는 프로그램
		System.out.println("===============");
		System.out.println("201704007 김정현");
		System.out.println("===============");

		int student;//학생 수
		Scanner in =new Scanner(System.in);

		System.out.println("입력할 학생의 수를 입력해주세요");
		student=in.nextInt();//입력
		
		while(student<=0)//0이하의 수를 입력했을 경우
		{
			in.nextLine();//버퍼값 제거
			System.out.println("잘못된 값입니다. 다시 입력해주세요.");
			System.out.println("입력할 학생의 수를 입력해주세요");
			student=in.nextInt();//다시입력하기 위함
		}
		
				int student_user[]=new int[student];//배열 생성
				System.out.println(student+"명의 프로그래밍 점수를 입력해주세요. (0~100)");//안내문
				for(int i=0; i<student;i++)
				{
						//입력 받고 싶은 수만큼 정수 입력하고 배열에 저장
						System.out.print((i+1)+":");
						//배열은 0부터 시작하지만 입력하는 수는 1부터 출력되야 하므로 +1해줌
						student_user[i]=in.nextInt();//입력받기
						
						while(student_user[i]<0 || student_user[i]>100)//0~100사이의 수가 아닐 경우
						{
							in.nextLine();//버퍼값 제거
							System.out.println("잘못된 값입니다. 다시 입력해주세요.");
							System.out.print((i+1)+":");
							student_user[i]=in.nextInt();//입력받기
						}
						
				}
				System.out.println("결과");
				for(int i=0;i<student;i++)//결과 출력
				{
					int score=student_user[i]/10;
					if(student_user[i]<20&&student_user[i]>=0)//0~19 때는 별이 1개 출력되야하므로
					{
						score=1;
					}
					else //예외의 경우 try로 했으면 좋았을텐데...
						System.out.print("");
					System.out.println((i+1)+":"+student_user[i]+"점 : ");
					
					for(int s=0; s<score ;s++)//점수(*)출력
					{
						System.out.print("*");
					}
					System.out.println("");
				}
				
	
	}
}
