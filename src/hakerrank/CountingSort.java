package hakerrank;
import java.util.Scanner;
public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextInt();
}
for (int i = 0; i < 100; i++) {int count=0;
	for (int j = 0; j < a; j++) {
		if(i==b[j]){count++;}
	}System.out.print(count+" ");
}
	}

}
	