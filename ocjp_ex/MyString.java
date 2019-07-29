package ocjp;
import java.util.*;
import java.lang.*;
class MyString{
	String msg;
	MyString(String msg){
		this.msg = msg;
	}
}
public class h {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello "+ new StringBuilder("java SE 8"));
			System.out.println("Hello "+ new MyString("Java SE 8"));
	}

}
