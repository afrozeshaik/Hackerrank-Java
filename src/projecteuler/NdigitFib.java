package projecteuler;

import java.util.Scanner;

public class NdigitFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();int b[]=new int[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextInt();
}
for (int i = 0; i < b.length; i++) {
	int k=b[i];
	long m=1;long n=1;int count=2;
	while(n/Math.pow(10, b[i]-1)<=1){
		long temp=n;
		n=n+m;
		m=temp;count++;
	}System.out.println(count);
}
	}

}
