package hakerrank;
import java.util.Scanner;
public class SumSquares {
public static void main(String[] args){
	
	Scanner s= new Scanner(System.in);
	int a=s.nextInt();
	long b[]=new long[a];
	for (int i = 0; i <a; i++) {
		b[i]=s.nextLong();
	}
	for (int i = 0; i < b.length; i++) {
	long m=((b[i]*(b[i]+1))*(b[i]*(b[i]+1)))/4;
		long n=b[i]*(b[i]+1)*(2*b[i]+1)/6;
		System.out.println(m-n);
	}
}
}
//2254743208597880