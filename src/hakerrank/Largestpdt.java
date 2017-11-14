package hakerrank;
import java.util.Scanner;
public class Largestpdt {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a= s.nextInt();
	int b[]=new int[2*a];
	long c[]=new long[a];
	for (int i = 0; i < a; i++) {
		b[2*i]=s.nextInt();
		b[2*i+1]=s.nextInt();
		c[i]=s.nextLong();
	}
	for (int i = 0; i <a; i++) {
		int max=0;int d[]=new int[100];
		long l=c[i];
		int k=0;
		while(l!=0){d[k]=(int) (l%10);
		l=l/10;
		k++;
			}
		
		
	}
}
}
