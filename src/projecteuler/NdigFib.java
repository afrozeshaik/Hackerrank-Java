package projecteuler;//incomplete

import java.util.Scanner;

public class NdigFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextInt();
}long ans[]=new long[5000];long max=0;
for (int i = 0; i < b.length; i++) {
	if(b[i]>max){max=i;}
}
ans[0]=1;ans[1]=1;
for (int i = 2; i < max; i++) {
	ans[i]=ans[i-1]+ans[i-2];
}
for (int i = 0; i < b.length; i++) {
	
}
	}

}
