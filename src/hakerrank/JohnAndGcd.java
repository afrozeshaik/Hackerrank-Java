package hakerrank;
import java.util.Scanner;
public class JohnAndGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
int c[][]=new int[a][];
for (int i = 0; i <a; i++) {
	b[i]=s.nextInt();
	for (int j = 0; j <b[i]; j++) {
		c[i][j]=s.nextInt();
	}
}
		for (int i = 0; i < a; i++) {
			int d[]=new int[b[i]];
		}
	}
	 private static int findGCD(int number1, int number2) {
	        //base case
	        if(number2 == 0){
	            return number1;
	        }
	        return findGCD(number2, number1%number2);
	    }
	  
}
