package hakerrank;
import java.math.BigInteger;
import java.util.Scanner;
public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int a=s.nextInt();
BigInteger k[]=new BigInteger[a];
for (int i = 0; i < k.length; i++) {
	k[i]=s.nextBigInteger();
}
int c[][]=new int[a][a];
for (int i = 0; i < a; i++) {
	for (int j = a-1; j >=0; j--) {
			c[i][j]=(k[i].remainder(BigInteger.valueOf(10)).intValue());
			k[i]=k[i].divide(BigInteger.valueOf(10));
	}
	
}
		
		
		if(a==1){System.out.println(c[0][0]);}
		else if(a==2){for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(c[i][j]);
			}System.out.println();
		}}
		else{
			for (int i = 0; i <a; i++) {
				System.out.print(c[0][i]);
			}System.out.println();
			for (int i = 1; i < a-1; i++) {
				System.out.print(c[i][0]);
				for (int j = 1; j < a-1; j++) {
					if(c[i][j]>c[i-1][j]&&c[i][j]>c[i+1][j]&&c[i][j]>c[i][j-1]&&c[i][j]>c[i][j+1])
					{
						System.out.print("X");
					}else{System.out.print(c[i][j]);}
				}System.out.println(c[i][a-1]);
			}for (int i = 0; i < a; i++) {
				System.out.print(c[a-1][i]);
			}
			
	
	}
		}

}
