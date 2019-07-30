package ocjp;
import java.util.*;
import java.lang.*;

public class h {
	static double area;
	int b = 2, h = 3;
	public static void main(String[] args) {
		double p,b,h;
		if (area == 0) {
			b=3;
			h=4;
			p=0.5;
		}
		area = p * b * h; //compilation fails at line n2
		System.out.println("Area is "+ area);
		}

}
