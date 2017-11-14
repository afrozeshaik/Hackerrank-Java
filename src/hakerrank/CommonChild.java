package hakerrank;
import java.util.Scanner;
public class CommonChild {
//0 cross,1 up,2 left
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String s1=s.next();
		String s2=s.next();
		int m=s1.length();
		int n=s2.length();
		char x[]=s1.toCharArray();
		char y[]=s2.toCharArray();
		int c[][]=new int[m+1][n+1];
		int b[][]=new int[m+1][n+1];
		for (int i = 1; i <=m; i++) {
			for (int j = 1; j <=n; j++) {
				if(x[i-1]==y[j-1]){
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
		
		
		System.out.println(c[m][n]);
		
	}

}
