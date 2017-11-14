package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class Rectangulargame {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		
		int x[]=new int[a];
		int y[]=new int[a];
		
		for (int i = 0; i <a; i++) {
			x[i]=s.nextInt();
			y[i]=s.nextInt();
		}Arrays.sort(x);Arrays.sort(y);
		int m=x[a-1];int n=y[a-1];int p[][]=new int[m+1][n+1];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <x[i] ; j++) {
				for (int k = 0; k<y[i]; k++) {
					p[j+1][k+1]=p[j+1][k+1]+1;
				}
			}
		}
		int max=0;
		for (int i = 0; i <m; i++) {
			for (int j = 0; j < n; j++) {
				if(p[i][j]>max){max=p[i][j];}
			}
		}int count=0;
		for (int i = 0; i <m; i++) {
			for (int j = 0; j < n; j++) {
				if(p[i][j]==max){count++;}
			}
		}System.out.println(count);
	}

}
