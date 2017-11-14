package hakerrank;
import java.util.Scanner;
public class Fibo {
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	long a=s.nextLong();
	long b[]=new long[(int) a];
	for (int i = 0; i < a; i++) {
		b[i]=s.nextLong();
	}long fib1=0;long fib2=1;
	
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < b.length; j++) {
			
		}
	}
}
}
/* public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b[]= new Long[100000];
        for (int i = 0; i < a; i++) {
			b[i]=s.nextLong();//stores 'a' elements in array 'b'
		}
        for (int i = 0; i < a; i++)
        {//checking if each number'b[i] is in fibonacci series
        	Long fibo1=1, fibo2=1, fibonacci=1;
        	for (int j = 0; j < b[i]; j++) {
        		fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
                fibo1 = fibo2;
                fibo2 = fibonacci;
                if(b[i]==fibonacci||b[i]==1){          	
                	System.out.println("IsFibo");
                	break;}
                	else if(fibonacci>b[i]){break;}
			}	if(b[i]!=fibonacci&&b[i]!=1){System.out.println("IsNotFibo");}
        	
		}
        
    }*/