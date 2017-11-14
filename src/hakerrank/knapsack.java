package hakerrank;

import java.util.Scanner;

public class knapsack{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        for(int i =0;i<t;i++){
            int n=s.nextInt();
            int m=s.nextInt();
            int c[]=new int[n+1];
            for(int j=1;j<=n;j++){
                c[j]=s.nextInt();
            }
            int sol[][]=new int[n+1][m+1];//j represents coins  k represents sum
            for (int j =1; j <=n; j++) {
				for (int k = 1; k <=m; k++) {
					if(k-c[j]>=0){
						sol[j][k]=Integer.max(sol[j-1][k],c[j]+sol[j][k-c[j]]);
					}
					else{
						sol[j][k]=sol[j-1][k];
					}
				}
			}
            
            System.out.println(sol[n][m]);
        }
    }
}