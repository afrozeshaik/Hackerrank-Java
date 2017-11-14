package projecteuler;

import java.util.Scanner;

public class MUl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for (int i = 0; i < a; i++) {
			int n=s.nextInt();
			int ar[][]=new int[n][n];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k <=j; k++) {
					ar[j][k]=s.nextInt();
				}
			}
			for (int j = n-2; j >=0; j--) {
				for (int k = 0; k <=j; k++) {
					if(ar[j+1][k]>ar[j+1][k+1]){ar[j][k]=ar[j][k]+ar[j+1][k];}
					else{ar[j][k]=ar[j][k]+ar[j+1][k+1];}
				}
			}
		System.out.println(ar[0][0]);
		}
		}

}
