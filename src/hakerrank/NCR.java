package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class NCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			long a=s.nextLong();
			long b[]=new long[(int) ((int) 2*a)];
			for (int i = 0; i < a; i++) {
				b[2*i]=s.nextLong();
				b[2*i+1]=s.nextLong();
			}
			for (int i = 0; i < a; i++) {
				int d=142857;
				BigInteger l=BigInteger.valueOf(d);
				BigInteger n=fact(b[2*i]);
				BigInteger m=fact(b[2*i+1]);
				BigInteger o=fact(b[2*i]-b[2*i+1]);
				BigInteger q=m.multiply(o);
				BigInteger z=findMMI_bruteforce(q,l);
				System.out.println( (q.remainder(l).multiply(z.remainder(l))).remainder(l) );
				/*BigInteger f=n.divide(q);
				//BigInteger x=n.remainder(l).multiply(q.modInverse(l));
				BigInteger g=fact(b[2*i]).divide(fact(b[2*i+1]).multiply(fact(b[2*i]-b[2*i+1])));
				System.out.println(f.remainder(l));*/
			}
	}
	static BigInteger fact(long a){
		BigInteger ans=BigInteger.valueOf(1);
		for (long i = 1; i <=a; i++) {
			BigInteger z=BigInteger.valueOf(i);
			ans=ans.multiply(z);
		}
		return ans;
	}
	static BigInteger findMMI_bruteforce(BigInteger n,BigInteger M)
	{
	    BigInteger i=BigInteger.valueOf(1);
	    while(M.compareTo(i)==1)// we need to go only uptil M-1
	    {
	        if( ( i.multiply(n) ).remainder(M)==BigInteger.valueOf(1))
	            return i;
	        i.add(BigInteger.valueOf(1));
	    }
	    return BigInteger.valueOf(-1);//MMI doesn't exist
	}
}
