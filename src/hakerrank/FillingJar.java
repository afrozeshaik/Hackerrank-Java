package hakerrank;
import java.util.Scanner;
public class FillingJar {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	long n=s.nextLong();
	long m= s.nextLong();
	long a[]=new long[(int) m];
	long b[]=new long[(int) m];
	long k[]=new long[(int) m];
	for (int i = 0; i < m; i++) {
		a[i]=s.nextLong();
		b[i]=s.nextLong();
		k[i]=s.nextLong();
	}long sum=0;
	for (int i = 0; i <m; i++) {
		sum=sum+(((b[i]-a[i])+1)*k[i]);
	}long ave=sum/n;
	System.out.println(ave);
}
}
