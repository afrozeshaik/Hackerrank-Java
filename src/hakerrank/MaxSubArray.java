package hakerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
			for (int i = 0; i <t; i++) {
				int noncsum=0;boolean b=false;
				for (int j = 0; j < n[i]; j++) {
					if(a[i][j]>0){b=true;noncsum=noncsum+a[i][j];}
					}
				if(b==false){noncsum=10;
				Arrays.sort(a[i]);
				noncsum=a[i][n[i]-1];
				}
				nc[i]=noncsum;
				int maxsum=-999999999;
				for (int j = 0; j < n[i]; j++) {
					int consum=0;
					for (int k = j; k <n[i]; k++) {
						consum=consum+a[i][k];
						if(consum>maxsum){maxsum=consum;}
					}
				}c[i]=maxsum;
			}
			for (int i = 0; i < t; i++) {
				System.out.println(c[i]+" "+nc[i]);
			}
	}

}
