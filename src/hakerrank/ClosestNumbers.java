package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class ClosestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			long b[]=new long[a];
			long d[]=new long[a-1];
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextInt();
			}Arrays.sort(b);int z=0;
			for (int i = 0; i <a-1; i++) {
				d[z]=b[i+1]-b[i];z++;
			}long min=10000000;
			for (int i = 0; i < d.length; i++) {
				if(d[i]<min){min=d[i];}
			}
			for (int i = 0; i < d.length; i++) {
				if(d[i]==min){System.out.print(b[i]+" "+b[i+1]+" ");}
			}
	}

}
