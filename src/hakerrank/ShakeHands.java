package hakerrank;
import java.util.Scanner;
public class ShakeHands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			for (int i = 0; i < a; i++) {
				b[i]=s.nextInt();
			}
			for (int i = 0; i < a; i++) {
				int ans=((b[i]-1)*(b[i]))/2;
				System.out.println(ans);
			}
	}

}
