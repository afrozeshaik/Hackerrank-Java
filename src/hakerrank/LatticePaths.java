package hakerrank;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;
public class LatticePaths {
	public static void main(String[] args){
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b[]= new  int[2*a];
		for (int i = 0; i < a; i++) {
			b[2*i]=s.nextInt();
			b[2*i+1]=s.nextInt();
		}
		for (int i = 0; i < a; i++) {
			int l=b[2*i];
			int p=b[2*i+1];
			int z=l+p;
			int y=fact(l);
			System.out.println(fact(l));
			int k=fact(p);
			int result=fact(z)/(k*y);
					System.out.println(result);
		}
}static int ans=1;
	public static int fact(int k){
		for (int i = 1; i <=k; i++) {
			 ans=ans*i;
		}return ans;
	}
}