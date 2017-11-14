package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class NcrTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		long b[]=new long[a];
		for (int i = 0; i < b.length; i++) {
			b[i]=s.nextLong();
		}
		for (int i = 0; i <a; i++) {
			System.out.print(1+" ");long k=1;
			for (int j = 1; j <=b[i]-1; j++) {
				k=((b[i]-j)/(j+1))*k;
				System.out.print(k+" ");
			}System.out.println(1);
		}
	}
static long fact(long a){
	long ans=1;
	for (int i = 1; i <=a; i++) {
		ans=ans*i;
	}return ans;
}
static BigInteger Fact(long a){
	BigInteger ans=BigInteger.valueOf(1);
	for (long i = 1; i <=a; i++) {
		BigInteger z=BigInteger.valueOf(i);
		ans=ans.multiply(z);
	}
	return ans;
}/*BigInteger n=fact(b[2*i]);
				BigInteger m=fact(b[2*i+1]);
				BigInteger o=fact(b[2*i]-b[2*i+1]);
				BigInteger q=m.multiply(o);
				BigInteger f=n.divide(q);*/
}
