package projecteuler;

import java.util.Scanner;

public class nthprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextInt();
}	for (int i = 0; i < b.length; i++) {
	int p=2;int c=1;
	while(c<b[i]){p++;
		if(prime(p)){c++;}
	}System.out.println(p);
}
	}
static boolean prime(long k){
	boolean b=true;
	for (int i = 2; i <=Math.sqrt(k); i++) {
		if(k%i==0){b=false;break;}
	}return b;
}
}
