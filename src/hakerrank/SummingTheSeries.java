package hakerrank;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class SummingTheSeries {
	static BigInteger bi = new BigInteger("1000000007"); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();long k=1000000009;
BigInteger b[]=new BigInteger[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextBigInteger();
}for (int i = 0; i < b.length; i++) {
	BigInteger ans=b[i].remainder(bi);
	BigInteger ans1=(ans.multiply(ans)).remainder(bi);
	System.out.println(ans1);
}
	}

}
