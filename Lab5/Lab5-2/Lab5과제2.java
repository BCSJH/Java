import java.util.Scanner;

public class Lab5����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 ������");
		System.out.println("================");

		Scanner in = new Scanner(System.in);
		int user_number;
		String name;
		int price;
		
		System.out.println("��� ��ǰ�� �Է��Ͻðڽ��ϱ�?");
		user_number=in.nextInt();
		
		product[] Product = new product[user_number];
		
		for(int i=0; i<user_number;i++)
		{
			in.nextLine();
			System.out.println((i+1)+". ��ǰ �� : ");
			name=in.nextLine();
			
			
			System.out.println((i+1)+". ��ǰ ���� : ");
			price=in.nextInt();
			
			Product[i]= new product(name, price);
		}
		order order = new order(user_number);
		System.out.println("���� ���� �ִ� ���� �Է����ּ���.");
		order.money=in.nextInt();
		
		order.showMenu(Product);
}
}
