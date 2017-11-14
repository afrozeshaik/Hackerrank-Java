package hakerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class AntiPalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=  new Scanner(System.in);
int t=s.nextInt();
int n[]=new int[t];
int m[]=new int[t];
BigInteger b[]=new BigInteger[t];
for (int i = 0; i < m.length; i++) {
	n[i]=s.nextInt();
	m[i]=s.nextInt();
}
	for (int i = 0; i <t; i++) {
		if(n[i]%2==0){b[i]=BigInteger.valueOf((long) ((n[i]/2)*m[i]*(m[i]-1)*(Math.pow(m[i], 4*((n[i]/2)-1)))));}
		else{b[i]=BigInteger.valueOf((long) ((n[i]/2)*m[i]*(m[i]-1)*(Math.pow(m[i], 5*((n[i]/2)-1)))));}
		System.out.println(b[i].remainder(BigInteger.valueOf(1000000007)));
	}
	}

}
