package hakerrank;

import java.util.Scanner;

public class Collatz_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
for (int i =  0; i < a; i++) {
	b[i]=s.nextInt();
}
for (int i = 0; i < a; i++) {
	int ans=0;
	while(b[i]!=1){
		if(b[i]%2==0){b[i]=b[i]/2;ans++;}
		else{b[i]=3*(b[i]/2)+1;ans++;}
	}System.out.println(ans);
}
	}

}
