package hakerrank;
import java.util.Scanner;
public class DigitFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();int finalans=0;
			for (int i = 1; i < a; i++) {
				int z=i;int sum=0;
				while(z!=0){int r=z%10;sum=sum+fact(r);z=z/10;}
				if(sum%i==0){finalans=finalans+i;}
			}System.out.println(finalans);
	}
	public static int fact(int k){
		
		int ans=1;
		for (int i = 2; i <=k; i++) {
			ans =ans*i;
		}return ans;
	}
}
