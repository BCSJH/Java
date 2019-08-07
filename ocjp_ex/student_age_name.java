package ocjp;
import java.util.*;
import java.lang.*;

public class h {
	class student{
		String name;
		int age;
	}
	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		s1 = s3;
		s3 = s2;
		s2 = null;
		
	}
}
