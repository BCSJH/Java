package Lab3;

import java.util.Scanner;

public class Lab333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 받고 싶은 개수를 입력하고 그것을 배열에 입력 후 정렬하여
		//뒤에서 가장 큰 값과 작은 값 찾기 
		System.out.println("===============");
		System.out.println("201704007 김정현");
		System.out.println("===============");

		Scanner in = new Scanner(System.in);//입력받기 위해 필요함
		int Number;//입력받고싶은 개수 입력하기 위한 변수
		int max=0, min=0;//가장 큰값과 작은 값을 구분하기 위함
		
		System.out.println("입력받고싶은 개수를 입력 :");//안내문
			Number=in.nextInt();//사용자로부터 입력받기
			while(Number<=0)//0이하의 수를 입력했을 경우
			{
				in.nextLine();//버퍼값 제거
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				System.out.println("입력할 학생의 수를 입력해주세요");
				Number=in.nextInt();
			}
			int Number_user[]=new int[Number];
			//입력받은 수만큼 입력한 수를 저장할 배열크기 만들기

			System.out.println(Number+"개의 정수를 입력해 주세요.");
			for(int i=0;i<Number;i++) {
				//입력 받고 싶은 수만큼 정수 입력하고 배열에 저장
				System.out.print((i+1)+" : ");
				//배열은 0부터 시작하지만 입력하는 수는 1부터 출력되야 하므로 +1해줌
				Number_user[i]=in.nextInt();//입력받기
			}
				//값을 비교하기 위해 먼저 지정
				min=Number_user[0];
				max=Number_user[0];
				
			for(int i=0;i<Number;i++)
			{
				//값비교
				if(Number_user[i]>max) {
					max=Number_user[i];
				}
				else if(Number_user[i]<min) {
					min=Number_user[i];
				}
				else//예외
					System.out.print("");
			}
			//결과
			System.out.println("가장 작은 값 : " + min);
			System.out.println("가장 큰 값 : " + max);
		}
}
