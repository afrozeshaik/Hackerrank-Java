package hakerrank;
import java.util.Scanner;
public class SherlockAndSquare {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int a = s.nextInt();
       long b[]= new long[a];
       for (int i = 0; i < b.length; i++) {
		b[i]=s.nextLong();}
		long l=4;
		for (int i = 0; i < b.length; i++) {long sum=0;
			for (int j = 1; j <=b[i]; j++) {
				sum=(long) (sum+Math.pow(2, j))%(1000000007);
			
		}System.out.println(l+(sum)%(1000000007));
	}
	}

}
