package Search;
import java.util.Scanner;
public class Basic {
public static void main (String[] args){
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int ar[]=new int[b];
	for (int i = 0; i < b; i++) {
		ar[i]=s.nextInt();
	}
	for (int i = 0; i < ar.length; i++) {
		if(ar[i]==a){System.out.println(i);break;}
	}
}
}
