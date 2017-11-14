package hakerrank;
import java.util.Scanner;
public class EasySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();long n[]=new long[a];
long m[]=new long[a];
for (int i = 0; i < m.length; i++) {
	n[i]=s.nextLong();
	m[i]=s.nextLong();
}
		for (int i = 0; i < m.length; i++) {long sum=0;
			long k=n[i]/m[i];sum=sum+k*sum(m[i]-1)+sum(n[i]%m[i]);
			System.out.println(sum);
		}
	}
static long sum(long k){
	long ans=(k*(k+1))/2;
	return ans;
}
}
