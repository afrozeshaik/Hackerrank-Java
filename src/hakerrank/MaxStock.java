package hakerrank;

import java.util.Scanner;

public class MaxStock {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a=s.nextInt();int n[]=new int[a];
        int b[][]=new int[a][50000];
        for (int i = 0; i <a; i++) {
			n[i]=s.nextInt();
			for (int j = 0; j <n[i]; j++) {
				b[i][j]=s.nextInt();
			}
		}
        	for (int i = 0; i < a; i++) {
				long profit=0;long max=Integer.MIN_VALUE;
				for (int j =n[i]-1; j>=0; j--) {
					if(max<b[i][j]){
						max=b[i][j];
					}
					profit=profit+(max-b[i][j]);
					
				}System.out.println(profit);
			}
	}}
