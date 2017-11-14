package hakerrank;
import java.util.Scanner;
public class LCS_new {
//0 cross,1 up,2 left
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int x[]=new int[m+1];
		int y[]=new int[n+1];
		for (int i = 1; i <=m; i++) {
			x[i]=s.nextInt();
		}
		for (int i = 1; i <=n; i++) {
			y[i]=s.nextInt();
		}
		int c[][]=new int[m+1][n+1];
		int b[][]=new int[m+1][n+1];
		for (int i = 1; i <=m; i++) {
			for (int j = 1; j <=n; j++) {
				if(x[i]==y[j]){
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]=0;
				}
				else{
					if(c[i-1][j]>=c[i][j-1]){
						c[i][j]=c[i-1][j];
						b[i][j]=1;
					}
					else{
						c[i][j]=c[i][j-1];
						b[i][j]=2;
					}
					
				}
			}
		}
		
		
		int rlen=c[m][n];
		int res[]=new int[rlen];
		int v1=m;int v2=n;int cnt=0;
		while(v1>0 && v2>0){
			if(b[v1][v2]==0){
				res[cnt]=x[v1];cnt++;
				v1-=1;v2-=1;
			}
			else if(b[v1][v2]==1){
				v1--;
			}
			else if(b[v1][v2]==2){
				v2--;
			}
					}
		
		for (int i =rlen-1; i >=0; i--) {
			System.out.print(res[i]+" ");
		}

		
	}

}
