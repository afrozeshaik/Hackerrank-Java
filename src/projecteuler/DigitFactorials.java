package projecteuler;

import java.util.Scanner;

public class DigitFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();long totalsum=0;
for (int i = 19; i < a; i++) {
	int c=i;int p=0;long sum=0;
	while(c!=0){
		p=c%10;
		c=c/10;
		sum=sum+fact(p);				
  			}if(sum%i==0){totalsum=totalsum+i;} 	  
  			}System.out.println(totalsum);
	}

	static long fact(int k){long ans=1;
		for (int i = 2; i <=k; i++) {
			ans=ans*i;
		}
		return ans;
	}
}
