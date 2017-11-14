package hakerrank;//unsuccessful

import java.util.Scanner;

public class Kaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
	for (int i = a; i<=b; i++) {
		if(kaprekar(i)){System.out.print(i+" ");}
	}

	}
public static boolean kaprekar(int k){
	
	int z=k;int c=0;
	while(z!=0){
		z=z/10;c++;
	}
	long ans=k*k;
	int left=(int) (ans/Math.pow(10, c));
	int right=(int) (ans%Math.pow(10, c));
	int lsum=0;int rsum=0;
	while(left!=0){lsum=lsum+left%10;left=left/10;}
	while(right!=0){rsum=rsum+left%10;left=left/10;}
	if(lsum==rsum){return true;}
	else{return false;}
	
}
}
