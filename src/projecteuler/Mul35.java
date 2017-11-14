package projecteuler;

import java.util.Scanner;

public class Mul35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}for (int i = 0; i < b.length; i++) {long k=b[i]-1;
	long ans= (((k/3)*(2*3 + ((k/3)-1)*3))/2)+((k/5)*(2*5 + ((k/5)-1)*5))/2-(((k/15)*(2*15 + ((k/15)-1)*15))/2);
System.out.println(ans);
}
	}

}
