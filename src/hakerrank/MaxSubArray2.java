package hakerrank;

import java.util.Scanner;

public class MaxSubArray2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int n[]=new int[t];
		int a[][]=new int[t][100000];
		int c[]=new int[t];
		int nc[]=new int[t];
		for (int i = 0; i < t; i++) {
			n[i]=s.nextInt();
			for (int j = 0; j < n[i]; j++) {
				a[i][j]=s.nextInt();
			}
		}
		for (int i = 0; i < t; i++) {
			int max=Integer.MIN_VALUE;
			long sum=0;
			for (int j = 0; j <n[i]; j++) {
				if(a[i][j]>max){max=a[i][j];}
				if(a[i][j]>0){sum=sum+a[i][j];}
			}
			if(max<0){nc[i]=max;}
			else{nc[i]=(int) sum;}
			
		}
	}

}
