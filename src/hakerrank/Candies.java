package hakerrank;//wrong approach
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s =new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextInt();
			}
			Arrays.sort(b);
			int n[]=new int[a];int temp=0;;
			for (int i = 0; i < n.length/2; i++) {
				n[2*i]=b[i];
				n[2*i+1]=b[n.length-1-i];
				temp=i;
			}
			if(a%2==1){n[2*(temp+1)]=b[temp+1];}
			
			int f[]=new int[a];f[0]=1;int sum=0;
			for (int i = 0; i < n.length-1; i++) {
				if(n[i]==n[i+1]){f[i+1]=1;}
				else if(n[i]>n[i+1]){f[i+1]=f[i]-1;}
				else if(n[i]<n[i+1]){f[i+1]=f[i]+1;}
			}
		for (int i = 0; i < f.length; i++) {
			sum=sum+f[i];
		}	System.out.println(sum);
	}


}
