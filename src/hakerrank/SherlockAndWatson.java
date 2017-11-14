package hakerrank;
import java.util.Scanner;
public class SherlockAndWatson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long n=s.nextLong();
long k=s.nextLong();int q=s.nextInt();
long a[]=new long[(int) n];long Q[]=new long[q];
for (int i = 0; i < n; i++) {
	a[i]=s.nextLong();
}for (int i = 0; i < q; i++) {
	Q[i]=s.nextLong();
}			for (int i = 0; i <k%n; i++) {long temp=a[a.length-1];
				for (int j = a.length-1; j >0; j--) {
					a[j]=a[j-1];
				}a[0]=temp;
	
}for (int i = 0; i < Q.length; i++) {
	System.out.println(a[(int) Q[i]]);
}
	}

}
