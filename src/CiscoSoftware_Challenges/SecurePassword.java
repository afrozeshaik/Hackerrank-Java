package CiscoSoftware_Challenges;

import java.util.Scanner;

public class SecurePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
int c[]=new int[a];
for (int i = 0; i < a; i++) {
	b[i]=s.nextInt();
	c[i]=s.nextInt();
}
			for (int i = 0; i < c.length; i++) {
				long sum=0;
				for (int j = b[i]; j <=c[i]; j++) {
					sum=(long) (sum+Math.pow(10, j));
				}
				if(sum>1000000){System.out.println("YES");}
				else{System.out.println("NO");}
				}
	}

}
