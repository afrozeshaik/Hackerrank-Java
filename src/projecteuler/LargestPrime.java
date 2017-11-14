package projecteuler;

import java.util.Scanner;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}
for (int i = 0; i < b.length; i++) {
	long k=b[i];long ans=k;
	for (long j = k; j>1; j--) {
		if(isprime(j)&&b[i]%j==0){ans=j;break;}
	}System.out.println(ans);
}
	}
	static boolean isprime(double k){
		boolean b=true;
		if(k!=2&&k%2==0){b=false;}
		else{
		for (int i = 2; i <=Math.sqrt(k); i++) {
			if(k%i==0){b=false;break;}
		}}
		return b;
	}
}
