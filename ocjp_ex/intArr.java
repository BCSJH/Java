package ocjp;
import java.util.*;
import java.lang.*;

public class h {
	public static void main(String[] args) {
		int[] intArr = {15,30,45,60,75};
		intArr[2] = intArr[4];  //{15,30,75,60,75};
		intArr[4] = 90;			//{15,30,75,60,90};
		for (int i=0; i<intArr.length;i++) {
			System.out.print(intArr[i]);
			if (i != intArr.length-1)
				System.out.print(", ");
		}
		}

}
