package hakerrank;

import java.util.Scanner;

public class StringSimilarity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String S[]=new String[a];
char c[][]=new char[a][1000000];
for (int i = 0; i < a; i++) {
	S[i]=s.next();
	c[i]=S[i].toCharArray();
}
			for (int i = 0; i < a; i++) {
				int count=S[i].length();
				for (int j = 1; j < S[i].length(); j++) {
					int k=0;int p=j;
					while(p<S[i].length()){
						if(c[i][p]==c[i][k]){count++;}
						else{break;}
						p++;k++;
					}
				}System.out.println(count);
			}
	}

}
