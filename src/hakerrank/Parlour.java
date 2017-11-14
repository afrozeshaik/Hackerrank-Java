package hakerrank;
import java.util.Scanner;
public class Parlour {
	public static void main(String[] args){
Scanner s= new Scanner(System.in);
	int a = s.nextInt();
	int m[]=new int[a];
	int n[]=new int[a];
	int c[][]=new int[a][10000];
	for (int i = 0; i < a; i++) {
		m[i]=s.nextInt();
		n[i]=s.nextInt();
		for (int j = 0; j <n[i]; j++) {
			c[i][j]=s.nextInt();
		}
		
	}
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < n[i]; j++) {
			for (int k = j+1; k <n[i]; k++) {
				if(c[i][j]+c[i][k]==m[i]){int p=j+1;int o=k+1;System.out.println(p+" "+o);}
			}
		}
	}
	}
		}
