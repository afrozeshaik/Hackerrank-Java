package hakerrank;//incomplete
import java.util.Arrays;
import java.util.Scanner;
public class GameOfRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}		long sum[]=new long[a];
		long temp=b[0];for (int i = 0; i < b.length-1; i++) {
			b[i]=b[i+1];
		}b[b.length-1]=temp;
		for (int i = 0; i < b.length; i++) {
			sum[0]=sum[0]+(i+1)*b[i];
		}
	
	}

}
