package hakerrank;//wrong

import java.math.BigInteger;
import java.util.Scanner;

public class PositiveIntegralSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
BigInteger b=fact(n);
int k=no_of_factors(b);
System.out.println((4*k-2)%1000006);
	}
static BigInteger fact(int n){
	BigInteger b=BigInteger.valueOf(1);
	for (int i = 2; i <=n; i++) {
		b=b.multiply(BigInteger.valueOf(i));
	}
	return b;
}
static int no_of_factors(BigInteger b){
	int k=0;BigInteger a=BigInteger.valueOf(2);
	for (BigInteger i = BigInteger.valueOf(1); ((b.multiply(b)).divide(a)).compareTo(i)>=0; b.add(BigInteger.valueOf(1))) {
		if((b.remainder(i)).equals(0)){k++;}
	}
	return k;
}
}
