package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class GcdProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int m=s.nextInt();
			int n=s.nextInt();
			BigInteger b=BigInteger.valueOf(1);
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					b=b.multiply(findGCD(i,j)).remainder(BigInteger.valueOf(1000000007));
				}
			}System.out.println(b.remainder(BigInteger.valueOf(1000000007)));
	}
	private static BigInteger findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return BigInteger.valueOf(number1);
        }
        return findGCD(number2, number1%number2);
    }
  
}
