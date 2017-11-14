package hakerrank;//Unsuccessful
import java.util.Scanner;
public class JourneyToMoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			long a=s.nextLong();
			long b=s.nextLong();int z=0;
			long c[][]=new long[(int) a][(int) a];
			for (int i = 0; i < b; i++) {
				int x=s.nextInt();
				int y=s.nextInt();
				c[x][y]=1;
				c[y][x]=1;
			}
			for (int i = 0; i < a; i++) {
				for (int j = i; j < a; j++) {
					for (int k = j; k < a; k++) {
						if(c[i][j]==1&&c[j][k]==1){c[i][k]=1;}
					}
				}
			}
			for (int i = 0; i <a; i++) {
				for (int j = 0; j <a; j++) {
					if(c[i][j]==1){z=z+1;}
				}
			}
			
			long ans=(a*(a-1)/2)-z/2;
			System.out.println(ans);
	
		}
}
