package hakerrank;
import java.util.Scanner;
public class Closestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long t=s.nextLong();
long a[][]=new long[(int) t][3];
for (int i = 0; i < t; i++) {
	a[i][0]=s.nextLong();
	a[i][1]=s.nextLong();
	a[i][2]=s.nextLong();
	
}
for (int i = 0; i < a.length; i++) {
	long ans=(long) Math.pow(a[i][0], a[i][1]);
	long value=ans%a[i][2];
	if(ans<1){System.out.println(0);}else{
	if(value<(a[i][2]-value)){System.out.println(a[i][0]-value);}
	else{System.out.println(a[i][0]-value+a[i][2]);}}
	}
	}

}
