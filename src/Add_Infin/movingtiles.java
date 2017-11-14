package Add_Infin;


import java.util.Scanner;

public class movingtiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long l=s.nextLong();long s1=s.nextLong();long s2=s.nextLong();
long S;
if(s1>s2){S=s1-s2;}
else{S=s2-s1;}
int t=s.nextInt();
long b[]=new long[t];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}
		for (int i = 0; i < b.length; i++) {
			double time=(Math.sqrt(2)*(l-Math.sqrt(b[i])))/S;
			System.out.println(time);
		}
	}

}
