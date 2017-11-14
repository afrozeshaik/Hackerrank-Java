package projecteuler;

import java.util.Scanner;

public class NameScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String S[]=new String[a];
for (int i = 0; i < S.length; i++) {
	S[i]=s.next();
}int b=s.nextInt();
String q[]=new String[b];
for (int i = 0; i < q.length; i++) {
	q[i]=s.next();
}for (int i = 0; i < q.length; i++) {
	char[] ans=q[i].toCharArray();int sum=0;int val=0;;
	for (int j = 0; j < ans.length; j++) {
		sum=sum+((int)(ans[j])-64);
	}
	for (int j = 0; j < S.length; j++) {
		if(q[i].equals(S[j])){val=j+1;}
	}System.out.println(sum*val);
}
	}

}
