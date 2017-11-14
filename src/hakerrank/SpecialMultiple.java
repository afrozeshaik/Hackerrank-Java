package hakerrank;

import java.util.Scanner;

public class SpecialMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n[]=new int[a];
for (int i = 0; i < n.length; i++) {
	n[i]=s.nextInt();
}
for (int i = 0; i < n.length; i++) {
	for (int j = 9;; j=j+9) {
		if(ns(j)&&j%n[i]==0){System.out.println(j);break;}
	}
}
	}
static boolean ns(int k){
	boolean b=true;int m;
	while(k>0){
		m=k%10;
		k=k/10;
		if(m!=9&&m!=0){
			b=false;break;
		}
	}return b;
}
}
