package projecteuler;//incomplete

import java.util.Scanner;

public class TriangleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		double b[]=new double[a];
		for (int i = 0; i < b.length; i++) {
			b[i]=s.nextInt();
		}for (int i = 0; i < b.length; i++) {
			double x= Math.sqrt(1+8*b[i]);
			
			if(x==Math.floor(x)){System.out.println((int)(x-1)/2);}
			else{System.out.println(-1);}
		}
	}

}
