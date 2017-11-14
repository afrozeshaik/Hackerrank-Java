package hakerrank;
import java.util.Scanner;
public class Symmetric {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b[]=new int[4*a];
		for (int i = 0; i < a; i++) {
			b[4*i]=s.nextInt();
			b[4*i+1]=s.nextInt();
			b[4*i+2]=s.nextInt();
			b[4*i+3]=s.nextInt();
		}
		for (int i = 0; i < a; i++) {
			int m=2*b[4*i+2]-b[4*i];
			int n=2*b[4*i+3]-b[4*i+1];
			System.out.println(m+" "+n);
		}

	}

}
//x+y/2=z  2z-x=y