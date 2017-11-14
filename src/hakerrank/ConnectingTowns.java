package hakerrank;//Unsuccessful
import java.util.Scanner;
public class ConnectingTowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			int c[][]=new int[a][1000];
			for (int i = 0; i <a; i++) {
				b[i]=s.nextInt();
				for (int j = 0; j <b[i]-1; j++) {
					c[i][j]=s.nextInt();
				}
			}
			for (int i = 0; i < a; i++) {
				long ans=1;
				for (int j = 0; j < b[i]-1; j++) {
					ans=ans%1234567*c[i][j]%1234567;
				}System.out.println(ans);
			}
	}

}
