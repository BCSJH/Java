import java.util.Scanner;

public class order {
	int money;
	int result_m;
	public void showMenu(product[] p){
	System.out.println("��ǰ�� �����ϼ���.");
	
	for(int i=0; i<p.length ; i++)
		System.out.println((i+1) + "." + p[i].name + ":" + p[i].price +"��");

	Scanner u = new Scanner(System.in);
	
	result_m=u.nextInt();
	System.out.println(p[result_m-1].name+" ��ǰ�� �����߽��ϴ�.");
	result(p[result_m-1].getprice());
	
	}
	
	public order(int money){
		this.money=money;	
	}
	

	public void result(int menu){
		money-=menu;
		if(money<0)
		{
			System.out.println("����� ���� ������ �����ϱ��ƽ��ϴ�.");
			System.out.println(-money+"�� �� �ʿ��մϴ�.");
		}
		else
		{
			System.out.println("���� ���� : "+money + "�Դϴ�.");
		}
	}

}

