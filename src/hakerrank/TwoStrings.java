package hakerrank;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String s1[]=new String[a];
String s2[]=new String[a];
int ans[]=new int[a];
for (int i = 0; i < a; i++) {
	s1[i]=s.next();
	s2[i]=s.next();
}
for (int i = 0; i < ans.length; i++) {
	char c1[]=s1[i].toCharArray();
	char c2[]=s2[i].toCharArray();boolean b=false;
	for (int j = 0; j < c1.length; j++) {
		if(b){break;}
		for (int k = 0; k < c2.length; k++) {
			if(c1[j]==c2[k]){ans[i]=1;b=true;break;}
		}
	}
}
for (int i = 0; i < ans.length; i++) {
	if(ans[i]==1){System.out.println("YES");}
	else{System.out.println("NO");}
}
	}

}
