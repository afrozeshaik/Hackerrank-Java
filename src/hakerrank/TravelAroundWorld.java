package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class TravelAroundWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			long n=s.nextLong();
			BigInteger c=s.nextBigInteger();
			long a[]=new long[(int) n];
			long b[]=new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i]=s.nextLong();
			}
			for (int i = 0; i < n; i++) {
				b[i]=s.nextLong();
			}
			BigInteger g=BigInteger.valueOf(0);int count=0;
			for (int i = 0; i <n; i++) {
				g=BigInteger.valueOf(a[i]);int p=i;
				for (int j = 0; j < n; j++) 
				{g=g.subtract(BigInteger.valueOf(b[(int) (p%n)]));
				if(p==n-1){if((g.add(BigInteger.valueOf(a[0]))).compareTo(c)==1){g=c;}
				else{g=g.add(BigInteger.valueOf(a[0]));}p++;}
				else{
				if((g.add(BigInteger.valueOf(a[(int) (p%n+1)]))).compareTo(c)==1){g=c;}
				else{g=g.add(BigInteger.valueOf(a[(int) (p%n+1)]));}p++;}
				if(g.compareTo(BigInteger.valueOf(0))<1){count--;break;}
				
				}count++;
			}System.out.println(count-1);
			
	}

}
