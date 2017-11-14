package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		long c[]=new long[a];
		BigInteger b[]=new BigInteger[a];
		for (int i = 0; i < b.length; i++) {
			c[i]=s.nextLong();
		}
		
		for (int i = 0; i < b.length; i++) {BigInteger sum= new BigInteger ("0");
				BigInteger con= new BigInteger ("2");
				b[i]=con.pow((int) c[i]);
			while(b[i].compareTo(BigInteger.valueOf(0))>0){
				sum=sum.add(b[i].remainder(BigInteger.valueOf(10)));
				b[i]=b[i].divide(BigInteger.valueOf(10));
			}
			System.out.println(sum);
		}
	}

}
