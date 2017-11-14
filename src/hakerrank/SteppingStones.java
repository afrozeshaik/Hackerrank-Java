package hakerrank;

import java.util.Scanner;
public class SteppingStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();long b[]=new long[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}			for (int i = 0; i < b.length; i++) {Long S=(long) 1;
						int m=2;
						while(S<b[i]){
							S=S+m;m++;
						}if(S==b[i]){System.out.println("Go On Bob "+(m-1));}
						else{System.out.println("Better Luck Next Time");}
					
}
	}

}
