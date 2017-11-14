package Foobar;
import java.util.Scanner;
public class ZeroGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int a[]=new int[t];
int b[]=new int[t];
			for (int i = 0; i <t; i++) {
				a[i]=s.nextInt();
				b[i]=s.nextInt();
			}
			for (int i = 0; i < t; i++) {int count=0;
			if(a[i]==b[i]){System.out.println("NOT POSSIBLE");}
			else{
				while(a[i]>0&&b[i]>0){
					if(a[i]==b[i]){break;}
					else if(a[i]>=b[i]){a[i]=a[i]-b[i];count++;}
					else{b[i]=b[i]-a[i];count++;}	
				}if(count%2==1){System.out.println("POSSIBLE");}
				else{System.out.println("NOT POSSIBLE");}}
			}
	}

}
