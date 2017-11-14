package hakerrank;
import java.util.Scanner;
public class infi_knapsack {
	public static void  main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i <t; i++) {
			int n=s.nextInt();
			int a=s.nextInt();
			int c[]=new int[n];
			for (int j = 0; j < n; j++) {
				c[j]=s.nextInt();
			}
			int dp[][]=new int[n+1][a+1];
			for (int j = 1; j < dp.length; j++) {
				for (int j2 = 1; j2 < dp.length; j2++) {
					
				}
			}
		}
	}
}
