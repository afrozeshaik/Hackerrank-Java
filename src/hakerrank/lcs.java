package hakerrank;
import java.util.Scanner;
public class lcs {

	public static void main(String[] args){ {
		// TODO Auto-generated constructor stub
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int n=s.nextInt();
	char x[]=new char[m+1];
	char y[]=new char[n+1];
	int c[][]=new int[m+1][n+1];
	char b[][]=new char[m+1][n+1];
	for (int i = 1; i <=m; i++) {
		x[i]=(char) s.nextInt();
	}
	for (int i = 1; i <=n; i++) {
		y[i]=(char) s.nextInt();
	}
	
	for (int i = 1; i <= m; i++) {
		for (int j = 1; j <= n; j++) {
			if(x[i]==y[j]){
				c[i][j]=c[i-1][j-1]+1;
				b[i][j]='c';
			}	
			else{
				if (c[i-1][j]>=c[i][j-1]){
					c[i][j]=c[i-1][j];
					b[i][j]='u';
				}
				else{c[i][j]=c[i][j-1];
					b[i][j]='l';
				}
				
			}
			
		}
	}int k=0;
	int len=c[m][n];
	int res[]=new int[len];
	int v1=m;int v2=n;
	while(v1>0 && v2>0){
		if(b[v1][v2]=='c'){
			res[k]=c[v1][v2];
			v1=v1-1;v2=v2-1;
		}
		else if(b[v1][v2]=='u'){
			v1=v1-1;
		}
		else if(b[v1][v2]=='l'){
			v2=v2-1;
		}
		for (int i =res.length-1; i>=0; i--) {
			System.out.print(res[i]+" ");
		}
	}
	
	}

	}}
