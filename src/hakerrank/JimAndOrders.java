package hakerrank;

import java.util.Scanner;

public class JimAndOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
int t=s.nextInt();
int a[]=new int[t];
int b[]=new int[t];
for (int i = 0; i < b.length; i++) {
	a[i]=s.nextInt();
	b[i]=s.nextInt();
	a[i]=a[i]+b[i];
}
	for (int i = 0; i < t; i++) {
		int min=Integer.MAX_VALUE;int minid=-1;;
		for (int j = 0; j < t; j++) {
			if(a[j]<min){min=a[j];minid=j;}
		}System.out.print(minid+1+" ");a[minid]=Integer.MAX_VALUE;
	}
	}

}
