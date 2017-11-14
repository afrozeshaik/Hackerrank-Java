package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long a=s.nextLong();
long m[]=new long[(int) a];
for (int i = 0; i < m.length; i++) {
	m[i]=s.nextLong();
}long b=s.nextLong();
int n[]=new int[(int) b];
for (int i = 0; i < n.length; i++) {
	n[i]=s.nextInt();
}
Arrays.sort(m);
Arrays.sort(n);		long i=0;int j=0;	int temp=0;
			while(i<b&&j<a) {
				if(n[(int) i]==m[j]){j++;i++;}
				
				else if(n[(int) i]!=m[j]&&n[(int) i]!=temp){temp=n[(int) i];System.out.print(n[(int) i]+" ");i++;}
			}
	}

}
