package hakerrank;
import java.util.Scanner;
public class CountingSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long a=s.nextLong();
long b[]=new long[(int) a];
String S;
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
	S=s.next();
}		for (int i = 0; i <100; i++) {int c=0;
	for (int j = 0; j < b.length; j++) {
		if(i>=b[j]){c++;}
	}System.out.print(c+" ");
	
}
	}

}
