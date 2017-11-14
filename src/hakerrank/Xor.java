package hakerrank;

import java.util.Scanner;
public class Xor {
public static void main(String[] args){
	Scanner s =new Scanner(System.in);
	int a= s.nextInt();
	int b=s.nextInt();
	int k[]=new int[b+1];
	for (int i = 1; i <=b; i++) {
		k[i]=i;
	}int max=0;
	for (int i = a; i <= b; i++) {
		for (int j = a; j <=i; j++) {
			int ans=k[i]^k[j];
			if(ans>max){max=ans;}
		}
		
	}System.out.println(max);
	
}
}
