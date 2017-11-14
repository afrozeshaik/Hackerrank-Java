package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

public class EveFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
BigInteger b[]=new BigInteger[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextBigInteger();
}
		for (int i = 0; i < a; i++) {BigInteger sum=BigInteger.valueOf(2);
			BigInteger m=new BigInteger ("1");
			BigInteger n=new BigInteger ("2");BigInteger k= new BigInteger ("1");
			while(n.compareTo(b[i])<0){
				k=n;
				n=n.add(m);
				m=k;
				if(n.compareTo(b[i])<=0&&n.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0))==0){sum=sum.add(n);}
			}System.out.println(sum);
		}
	}

}
