package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class MarkAndToys {
public static void main(String[] args){
	        Scanner stdin=new Scanner(System.in);
	        int n=stdin.nextInt(),k=stdin.nextInt();
	        int prices[]=new int[n];
	        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
	        
	       Arrays.sort(prices);int ans=0;int z=0;
	       for (int i = 0; i < prices.length; i++) {
			{ans=ans+prices[i]; z++;}if(ans>k){break;}
		}System.out.println(z-1);
	    }
	}



