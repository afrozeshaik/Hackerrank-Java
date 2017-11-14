package hakerrank;//incomplete
import java.util.Scanner;
public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int a[]=new int[m+1];
int b[]=new int[n+1];

int lcs[][]=new int[m+1][n+1];
for (int i = 1; i <=m; i++) {
	a[i]=s.nextInt();
}for (int i = 1; i <= n; i++) {
	b[i]=s.nextInt();
}			for (int i = 0; i <= m; i++) {
			lcs[i][0]=0;
}for (int i = 0; i <= n; i++) {
			lcs[0][i]=0;
}					
					for (int i = 1; i <= m; i++) {
						for (int j = 1; j <= n; j++) {
							if(a[i]==b[j]){lcs[i][j]=1+lcs[i-1][j-1];}
							else{lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);}
						}
					}int ans[]=new int[lcs[m][n]];int k=0;	
					for (int i = 1; i <= m; i++) {
						if(lcs[i][n]>lcs[i-1][n]){ans[k]=a[i];k++;}
					}for (int i = 0; i <ans.length; i++) {
						System.out.print(ans[i]+" ");
						
					}
	}
static int max(int a,int b){
	if(a>b){return a;}
	else {return b;}
}
}
