package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class PriyqnkaAndToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextInt();
			}Arrays.sort(b);int min=b[0];int count=1;
			for (int i = 0; i < b.length; i++) {
				if(b[i]-min>4){count++;min=b[i];}
			}System.out.println(count);
	}

}