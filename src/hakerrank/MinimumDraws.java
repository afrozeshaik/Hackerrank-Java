package hakerrank;
import java.util.Scanner;
public class MinimumDraws {
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	int a= s.nextInt();
	int b[]=new int[a];
	for (int i = 0; i < b.length; i++) {
		b[i]=s.nextInt();
	}
	
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]+1);
	}
	
}
}
