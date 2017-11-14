package projecteuler;

import java.util.Scanner;

public class Truncatable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();long sum=0;
		for (int i = 11; i < a; i++) {
			if(truncatable(i)){sum=sum+i;}
		}System.out.println(sum);
	}
static boolean truncatable(int k){
	boolean b=true;int z=1;int temp=k;
	while(k>0){
		int rem=(int) (temp%Math.pow(10, z));
		if(!prime(rem)){b=false;break;}
		k=(int) (k/Math.pow(10, z));z++;
	}
	z=z-1;
	while(z>0){
		int q=(int) (temp/Math.pow(10, z));
		if(!prime(q)){b=false;break;}
		z--;
	}
	return b;
}
static boolean prime(double k){
	boolean b=true;
	if(k==1){b=false;}
	else{
	for (int i = 2; i<=Math.sqrt(k); i++) {
		if(k%i==0){b=false;}
	}}return b;
}
}
