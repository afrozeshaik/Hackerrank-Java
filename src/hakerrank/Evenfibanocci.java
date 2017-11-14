package hakerrank;
import java.util.Scanner;
public class Evenfibanocci {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b[]=new int[a];
	for (int i = 0; i <a; i++) {
		b[i]=s.nextInt();
	}for (int i = 0; i <a; i++) {
		int c=b[i];
		int sum=0;
		int fib[]=new int[c];
		fib[0]=1;fib[1]=2;
		for (int j=2; ; j++) {
			if(fib[j]>c){break;}
			fib[j]=fib[j-1]+fib[j-2];
		}
		for (int k = 0; k < fib.length; k++) {
			if(fib[k]%2==0&&fib[k]<c){sum=sum+fib[k];}
		}System.out.println(sum);
	}
}
}
