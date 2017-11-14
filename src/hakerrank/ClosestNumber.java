package hakerrank;

import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
long a[]=new long[t];
long b[]=new long[t];
long x[]=new long[t];
for (int i = 0; i < x.length; i++) {
	a[i]=s.nextLong();
	b[i]=s.nextLong();
	x[i]=s.nextLong();
}
	for (int i = 0; i < x.length; i++) {
		long n=(long) Math.pow(a[i], b[i]);
		int k=(int) (n%x[i]);
		long sm=n-k;
		long lar=n+x[i]-k;
		if((n-sm)<=(lar-n)){
			System.out.println(sm);
		}
		else{System.out.println(lar);}
	}
	}

}
