package ocjp;
import java.util.*;
import java.lang.*;

public class h {
	int x,y;
	public h(int x, int y) {
		initialize(x,y);
	}
	public void initialize(int x, int y) {
		this.x = x*x;
		this.y =y*y;
	}
	public static void main(String[] args) {
		int x = 3, y = 5;
		h obj = new h(x,y);
		System.out.println(x+" "+y);
	}
}
