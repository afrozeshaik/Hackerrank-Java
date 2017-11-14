package projecteuler;//incomplete

import java.math.BigInteger;
import java.util.Scanner;

public class PowerfulDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();BigInteger b=new BigInteger("0");int max=-1;
for (int i = 0; i <n; i++) {
	for (int j = 0; j < n; j++) {
		BigInteger a=BigInteger.valueOf(i);
		b=a.pow(j);
		int sum=sum(b);
		if(sum>max){max=sum;}
	}
}System.out.println(max);
	}
static int sum(BigInteger b){
	String c=b.toString();
	char q[]=c.toCharArray();int sum=0;
	for (int i = 0; i < q.length; i++) {
		sum=sum+q[i];
	}
	return sum;
}
}
