package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

public class sum10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		BigInteger b[]=new BigInteger[a];
		BigInteger sum=BigInteger.valueOf(0);
		for (int i = 0; i < b.length; i++) {
			b[i]=s.nextBigInteger();
		}
		for (int i = 0; i < b.length; i++) {
			sum=sum.add(b[i]);
		}
		String g=sum.toString().substring(0,10);
		System.out.println(g);
	}

}
//2728190129
