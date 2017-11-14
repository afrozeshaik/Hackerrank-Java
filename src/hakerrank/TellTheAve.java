package hakerrank;

import java.util.Scanner;

public class TellTheAve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
for (int i = 0; i < a; i++) {
	b[i]=s.nextLong();
					}		
			int k=1;
		while(k<a){
			b[0]=b[0]+b[k]+b[0]*b[k];
		}
		System.out.println(b[0]);
	}

}
