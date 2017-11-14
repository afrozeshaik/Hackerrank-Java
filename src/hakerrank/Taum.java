package hakerrank;
import java.util.Scanner;
public class Taum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		long b[]=new long[2*a];
		long c[]=new long[3*a];
		
			for (int i = 0; i < a; i++) {
				b[2*i]=s.nextInt();
				b[2*i+1]=s.nextLong();
				c[3*i]=s.nextLong();
				c[3*i+1]=s.nextLong();
				c[3*i+2]=s.nextLong();
			
		}
			for (int i = 0; i < a; i++) {
				if(c[3*i]==c[3*i+1]){System.out.println(b[2*i]*c[3*i]+b[2*i+1]*c[3*i+1]);}
				else if(c[3*i]>c[3*i+1] &&c[3*i]-c[3*i+1]>c[3*i+2])
				{System.out.println((b[2*i]+b[2*i+1])*c[3*i+1]+b[2*i]*c[3*i+2]);}
				else if(c[3*i]<c[3*i+1] &&c[3*i+1]-c[3*i]>c[3*i+2])
				{System.out.println((b[2*i]+b[2*i+1])*c[3*i]+b[2*i+1]*c[3*i+2]);}
				else{System.out.println(b[2*i]*c[3*i]+b[2*i+1]*c[3*i+1]);}
			}
	}

}
