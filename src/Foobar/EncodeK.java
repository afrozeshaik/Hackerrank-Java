package Foobar;
import java.util.Scanner;
public class EncodeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int a[]=new int[t];
int b[]=new int[t];
			for (int i = 0; i < b.length; i++) {
				a[i]=s.nextInt();
				b[i]=s.nextInt();
			}for (int i = 0; i < b.length; i++) {
				System.out.print(1+" "+(b[i]+1)+" ");
				for (int j = 1; j <=a[i]; j++) {
					if((j==1) || (j==1+b[i])){}
					else{System.out.print(j+" ");}
				}System.out.println();
			}
	}

}
