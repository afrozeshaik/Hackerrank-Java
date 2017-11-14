package hakerrank;
import java.util.Scanner;
public class SmallestMultiple {
	public static void main(String[] args){
Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b[]=new int[a];
	int arr[]= new int[40];
	for (int i = 0; i < b.length; i++) {
		b[i]=s.nextInt();
		
	}
	for (int i = 0; i <a; i++) {
		for (int j =1; j <=b[i]; j++) {
			arr[j]=j;
		}int l=1;
		
		for (int j = 2; j <= b[i]; j++) {
			
			l=lcm(l,j);
		}System.out.println(l);
		
	}
	}
	 
	
	
	    static int gcd(int x, int y)
	    {
	        int r=0, a, b;
	        a = (x > y) ? x : y; // a is greater number
	        b = (x < y) ? x : y; // b is smaller number
	 
	        r = b;
	        while(a % b != 0)
	        {
	            r = a % b;
	            a = b;
	            b = r;
	        }
	        return r;
	    }
	 
	    static int lcm(int x, int y)
	    {
	        int a;
	        a = (x > y) ? x : y; // a is greater number
	        while(true)
	        {
	            if(a % x == 0 && a % y == 0)
	                return a;
	            ++a;
	        }	
	    }
	 
	    
	}
