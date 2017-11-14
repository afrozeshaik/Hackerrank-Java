package codeash;
import java.math.BigInteger;
import java.util.Scanner;
public class Dash7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
int c[]=new int[a];int k=1;
for (int i = 0; i < c.length; i++) {
	b[i]=s.nextInt();
	c[i]=s.nextInt();
}
for (int i = 0; i < c.length; i++) {
	 k=findGCD(b[i],c[i]).intValue();
	System.out.println((b[i]/k)*(c[i]/k));
}
	}
	private static BigInteger findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return BigInteger.valueOf(number1);
        }
        return findGCD(number2, number1%number2);
    }
}
