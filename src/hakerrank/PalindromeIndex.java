package hakerrank;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int a=s.nextInt();
int res[]=new int[a];
for (int i = 0; i < a; i++) {
	String S=s.next();
	char c[]=S.toCharArray();
	boolean b=true;
	for (int j = 0; j <=c.length/2; j++) {
		if(c[j]!=c[c.length-1-j]){
			b=false;
			if(c[j]!=c[c.length-2-j]){
				res[i]=j;
				break;
			}
			else{res[i]=c.length-1-j;break;}
		}	
	}
	if(b){res[i]=-1;}
}
for (int i = 0; i < res.length; i++) {
	System.out.println(res[i]);
}
	}
	
	

}
