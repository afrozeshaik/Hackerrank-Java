package hakerrank;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int ans[]=new int[t];
for (int i = 0; i <t; i++) {
	int n=s.nextInt();
	int k=s.nextInt();int p=0;
	for (int j = 0; j <n; j++) {
		int time=s.nextInt();
		if(time<=0){p++;}
	}if(p<k){ans[i]=1;}
}
	for (int i = 0; i < ans.length; i++) {
		if(ans[i]==1){System.out.println("YES");}
		else{System.out.println("NO");}
	}
	}

}
