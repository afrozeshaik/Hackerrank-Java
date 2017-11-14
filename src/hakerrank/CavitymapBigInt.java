package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class CavitymapBigInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		BigInteger k[]=new BigInteger[a];
		int c[][]=new int[a][a];
		for (int i = 0; i < a; i++) {
			k[i]=s.nextBigInteger();
		}for (int i = 0; i < a; i++) {
			for (int j = a-1; j >=0; j--) {
					c[i][j]=(k[i].remainder(BigInteger.valueOf(10)).intValue());
					k[i]=k[i].divide(BigInteger.valueOf(10));
			}
			
		}
	}

}
/*for (int i = 0; i < a; i++) {
			for (int j = a-1; j >=0; j--) {
				c[i][j]=k[i]%10;
				k[i]=k[i]/10;
			}
		}
		
 */