package hakerrank;
import java.util.Scanner;
public class coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();
			int m= s.nextInt();
			int c[]=new int[m];
			for (int i = 0; i < c.length; i++) {
				c[i]=s.nextInt();
			}
			long t[][]=new long[n+1][m];
			for (int i = 0; i <m; i++) {
				t[0][i]=1;
			}
			for (int i = 1; i <=n; i++) {
				for (int j = 0; j <m; j++) {
					//excluding the coin
					long x=0;long y=0;
					if(j-1>=0){
						x=t[i][j-1];
					}
					else{
						x=0;
					}
					
					//including the coin
					
					if(i-c[j]>=0){
						y=t[i-c[j]][j];
					}
					else{
						y=0;
					}
					t[i][j]=x+y;
				}
			}
			System.out.println(t[n][m-1]);
			
	}

}
