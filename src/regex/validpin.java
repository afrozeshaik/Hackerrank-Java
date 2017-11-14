package regex;

import java.util.Scanner;

public class validpin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String[] S= new String[a];
for (int i = 0; i < a; i++) {
	S[i]=s.next();
}char c[]=new char[10];
for (int i = 0; i < S.length; i++) {
	boolean b=true;
	c=S[i].toCharArray();
	for (int j = 0; j < 5; j++) {
		if((int)c[j]<65 || (int)c[j]>90){
			System.out.println("NO");
			b=false;
			break;
			
		}
	}if(b){
	for (int j = 5; j < 9; j++) {
		if((int)c[j]<48 ||  (int)c[j]>57){
			System.out.println("NO");
			b=false;
			break;
		}
	}}
	if(b){
		if(c[9]<65 || c[9]>90){
			System.out.println("NO");
			b=false;
		}
	}
	if(b){System.out.println("YES");}
	
	
}
	}

}
