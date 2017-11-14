package projecteuler;//incomplete

import java.util.Scanner;

public class NameScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String S[]=new String[a];
		for (int i = 0; i < S.length; i++) {
			S[i]=s.next();
		}
		int qu=s.nextInt();
		String q[]=new String[qu];
		for (int i = 0; i < q.length; i++) {
			q[i]=s.next();
		}
		for (int i = 0; i < q.length; i++) {
			int val=1;long sum=0;
			for (int j = 0; j <S.length; j++) {
				if(q[i].equals(S[j])){val=1+j;}
			}
			
			char c[]=S[val-1].toCharArray();
			for (int j = 0; j < c.length; j++) {
				sum=sum+((int)c[j]-64);
				
			}
			System.out.println(val*sum);
		}
	}

}