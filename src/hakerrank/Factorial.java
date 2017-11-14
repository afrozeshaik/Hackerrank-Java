package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a= s.nextInt();
			long b[]=new long[a];
			long c[]=new long[a];
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextLong();
				c[i]=s.nextLong();
			}
			for (int i = 0; i < a; i++) {
			System.out.println((binomial(b[i],c[i])));
			}
			
	}
	static BigInteger binomial(final long b, final long c) {
	    BigInteger ret = BigInteger.ONE;
	    for (int k = 0; k < c; k++) {
	        ret = ret.multiply(BigInteger.valueOf(b-k))
	                 .divide(BigInteger.valueOf(k+1));
	    }
	    return ret;
	}


}
