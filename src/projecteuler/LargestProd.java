package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

public class LargestProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int n[]=new int[a];
		int k[]=new int[a];
		BigInteger b[]=new BigInteger[a];
		for (int i = 0; i < k.length; i++) {
			n[i]=s.nextInt();
			k[i]=s.nextInt();
			b[i]=s.nextBigInteger();
		}
		for (int i = 0; i < b.length; i++) {
			BigInteger d[]=new BigInteger[n[i]];
			BigInteger maxprod=BigInteger.valueOf(0);
			
			for (int j = 0; j < n[i]; j++) {
				d[j]=b[i].remainder(BigInteger.valueOf(10));
				b[i]=b[i].divide(BigInteger.valueOf(10));
			}
			for (int j = 0; j < n[i]-k[i]+1; j++) {BigInteger prod=BigInteger.valueOf(1);
				for (int p = j; p <j+k[i]; p++) {
					prod=prod.multiply(d[p]);
				}if(prod.compareTo(maxprod)>0){maxprod=prod;}
			}
			System.out.println(maxprod);
		}
	}

}
