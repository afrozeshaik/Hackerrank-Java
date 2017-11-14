package hakerrank;
import java.util.Scanner;
public class KCandyStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[2*a];
		for (int i = 0; i < a; i++) {
			b[2*i]=s.nextInt();
			b[2*i+1]=s.nextInt();
		}
		for (int i = 0; i < a; i++) {
			long m=b[2*i]+b[2*i+1]-1;
			long n=b[2*i];
			long ans=fact(m)/(fact(m-n)*fact(n));
			System.out.println(ans);
		}
	}
	static long fact(long m)
	{
	if(m==0)return 1;
	return m*fact(m-1);
	}
}
