package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Factdigsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c[]=new int[a];
		BigInteger sum[]=new BigInteger[a];
		BigInteger b[]=new BigInteger[a];
		for (int i = 0; i < a; i++) {
			c[i]=s.nextInt();
		}
		for (int i = 0; i <a; i++) {b[i]=BigInteger.valueOf(1);
			for (int j = 2; j <=c[i]; j++) {
				b[i]=b[i].multiply(BigInteger.valueOf(j));
			}
		}
		for (int i = 0; i < a; i++) {sum[i]=BigInteger.valueOf(0);
			while(b[i].compareTo(BigInteger.valueOf(0))>0){
				sum[i]=sum[i].add(b[i].remainder(BigInteger.valueOf(10)));
				b[i]=b[i].divide(BigInteger.valueOf(10));
			}System.out.println(sum[i]);
		}
	}

}
