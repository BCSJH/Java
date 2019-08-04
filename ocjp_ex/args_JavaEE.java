package ocjp;
import java.util.*;
import java.lang.*;

public class h {
	public static final int MIN = 1;
	public static void main(String[] args) {
			int x = args.length;
			System.out.println(x);
			if(checkLimit(x)) {
				System.out.println("Java SE");	
			}else {
				System.out.println("Java EE");
			}
			}
			public static boolean checkLimit(int x) {
				return (x>=MIN)?true:false;
			}
}
