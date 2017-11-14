package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c[]=new int[a];
for (int i = 0; i < c.length; i++) {
	c[i]=s.nextInt();
}int count=0;Arrays.sort(c);
for (int i = 0; i < c.length-1; i++) {
	for (int j = i+1; j < c.length; j++) {
		if(c[j]-c[i]==b ){count++;}
		else if(c[j]-c[i]>b){break;}
	}	
}System.out.println(count);
	}

}
