package hakerrank;//unsuccessful
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	String S[]=new String[a];
	for (int i = 0; i < S.length; i++) {
		S[i]=s.next();
	}
	for (int i = 0; i < S.length; i++) 
	{int count=0;
		char c[]=S[i].toCharArray();int k=c.length/2;
		if(c.length%2==1){System.out.println(-1);}
		else{
					for (int j = 0; j < k; j++) {
						for (int j2 = k; j2 < c.length; j2++) {
							if(c[j]==c[j2]){c[j2]=0;count++;break;}
						}
					}System.out.println(k-count);
		}
		
	}
		
	
	
}
}
