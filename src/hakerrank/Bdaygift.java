package hakerrank;
import java.util.Scanner;
public class Bdaygift {
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int a= s.nextInt();
	int b[] = new int[a];
	for(int i=0;i<a;i++){
		b[i]=s.nextInt();
	}
	float ans=0;
	for (int i = 0; i < b.length; i++) {
		ans=ans+b[i];
	}
	System.out.println(ans/2);
	}
}