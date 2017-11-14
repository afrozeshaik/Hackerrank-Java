package codeash;
import java.util.Scanner;
public class easydash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
String a=s.next();
char c[]=a.toCharArray();
for (int i = 0; i < c.length; i++) {
	boolean b=true;
	for (int j = 0; j < i; j++) {
		if(c[i]==c[j]){b=false;break;}
	}if(b){System.out.print(c[i]);}
}
	}

}
