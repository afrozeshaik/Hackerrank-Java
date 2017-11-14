package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			BigInteger b[]=new BigInteger[2*a];
			for (int i = 0; i <a; i++) {
				b[2*i]=s.nextBigInteger();
				b[2*i+1]=s.nextBigInteger();
			}
			
	}
		static boolean prime(BigInteger b){
			boolean c=true;BigInteger i=BigInteger.valueOf(1);
			while(b.compareTo(i)==1){
				if(b.remainder(i)==BigInteger.valueOf(0)){c=false;}
				b.add(BigInteger.valueOf(1));
			}return c;
		}
}
