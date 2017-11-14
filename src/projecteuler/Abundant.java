package projecteuler;

import java.util.Scanner;

public class Abundant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();int b[]=new int[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextInt();
}
		for (int i = 0; i < b.length; i++) {int k=b[i]-1;boolean p=false;
			for (int j = 1; j <b[i]; j++) {
					if(abundant(j)&&abundant(k)){System.out.println("YES");p=true;break;}
				k--;
			}if(!p){System.out.println("NO");}
		}
	}
static boolean abundant(int k){
	boolean b=false;long sum=0;
	for (int i = 1; i <=k/2; i++) {
		if(k%i==0){sum=sum+i;}
	}
	if(sum>k){b=true;}
return b;	
}
}
