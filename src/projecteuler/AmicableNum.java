package projecteuler;//incomplete

import java.util.Scanner;

public class AmicableNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[]=new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i]=s.nextInt();
		}
		for (int i = 0; i < b.length; i++) {long asum=0;
			for (int j = 2; j < b[i]; j++) {
				if(amicable(j)){asum=asum+j;}
			}System.out.println(asum);
		}
		
	 }
	static boolean amicable(int k){
		int sum=0;int sum2=0;
		for (int i = 1; i <=k/2; i++) {
			if(k%i==0){sum=sum+i;}
		}
		for (int i = 1; i <=sum/2; i++) {
			if(sum%i==0){sum2=sum2+i;}
		}
		if(sum2==k&&sum!=k){return true;}
		else{return false;}
		
		
	} 
}
