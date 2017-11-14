package hakerrank;
import java.util.Scanner;
public class FlippingBits {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}
			for (int i = 0; i < a; i++) {long sum=0;
			int c[]=new int[32];
			for (int j = 0; j < c.length; j++) {
				c[j]= (int) (b[i]%2);
				b[i]=b[i]/2;	
			}
			for (int j = 0; j < c.length; j++) {
				if(c[j]==0){c[j]=1;}
				else{c[j]=0;}
			}
			for (int j = 0; j < c.length; j++) {
				sum=(long) (sum+(Math.pow(2, j)*c[j]));
			}System.out.println(sum);
			}	
	}
}



