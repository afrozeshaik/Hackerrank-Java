package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class PickingCsrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			int c[][]=new int[a][50000];
			for (int i = 0; i < a; i++) {
				b[i]=s.nextInt();
				for (int j = 0; j <b[i]; j++) {
					c[i][j]=s.nextInt();
				}
			}
			for (int i = 0; i <a; i++) {
				Arrays.sort(c[i]);
			}
			for (int i = 0; i < a; i++) {
				int ans=1;
				for (int j = 1; j <b[i]; j++) {
					if(c[i][j]>j-1){System.out.println(0);break;}
				}
			}
	}

}
