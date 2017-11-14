package projecteuler;

import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextInt();
}
for (int i = 0; i < b.length; i++) {
	long sum=0;
	for (int j = 2; j < b[i]; j++) {
		if(isprime(j)){sum=sum+j;}
	}System.out.println(sum);
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
