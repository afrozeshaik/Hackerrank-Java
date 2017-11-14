package hakerrank;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
public class FloydMarshall {
 public static void main(String[] args){
	 Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 int e = s.nextInt();
	 long floyd[][]= new long[n][n];
	 for (int i = 0; i < floyd.length; i++) {
			for (int j = 0; j < floyd.length; j++) {
				floyd[i][j]=Integer.MAX_VALUE;
			}	
		}
	 for (int i = 0; i < floyd.length; i++) {
		floyd[i][i]=0;
	}
	 
	 for (int i = 0; i <e; i++) {
		floyd[s.nextInt()-1][s.nextInt()-1]=s.nextInt();
	}
	 
	
	 
	 for (int k = 0; k < n; k++)
     {
         // Pick all vertices as source one by one
         for (int i = 0; i < n; i++)
         {
             // Pick all vertices as destination for the
             // above picked source
             for (int j = 0; j < n; j++)
             {
                 // If vertex k is on the shortest path from
                 // i to j, then update the value of dist[i][j]
                 if (floyd[i][k] + floyd[k][j] <floyd[i][j])
                     floyd[i][j] = floyd[i][k] + floyd[k][j];
             }
         }
     }

	int t=s.nextInt();
	for (int i = 0; i <t; i++) {
		int a=s.nextInt()-1;
		int b=s.nextInt()-1;
		if(floyd[a][b]>=Integer.MAX_VALUE){
			System.out.println(-1);
		}
		else{
			System.out.println(floyd[a][b]);
		}
	}
	
	
	
	 
 }

}
