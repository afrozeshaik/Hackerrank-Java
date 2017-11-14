package hakerrank;

import java.util.Scanner;

public class WhiteShark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}

for (int i = 0; i < b.length; i++) {
	long k=b[i]*2;
	long p=b[i]/42;
	System.out.println((k+2*p)%10000006);
}
	}

}
