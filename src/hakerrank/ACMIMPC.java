package hakerrank;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ACMIMPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long a=s.nextLong();
		long b=s.nextLong();
		BigInteger d[]=new BigInteger[(int) a];
		int c[][]=new int[(int) a][(int) b];
		for (int i = 0; i <a; i++) {
		d[i]=s.nextBigInteger();	
		}for (int i = 0; i < a; i++) {
			for (int j =0; j <b; j++) {
				c[i][j]=(d[i].remainder(BigInteger.valueOf(10)).intValue());
				d[i]=d[i].divide(BigInteger.valueOf(10));
		}}long k=(a*(a-1))/2;
		int max[]=new int[(int) k];int z=0;
		for (int i = 0; i <a-1; i++) {
			for (int j = i+1; j < a; j++) {
				for (int l = 0; l < b; l++) {
					if(c[i][l]==1 || c[j][l]==1){max[z]++;}
				}z++;
			}
		}Arrays.sort(max);
		System.out.println(max[(int) (k-1)]);int count=0;
		for (long i = k-1; i >=0; i--) {
			if(max[(int) i]==max[(int) (k-1)]){count++;}
			else{break;}
		}System.out.println(count);
		
		}
		
	static long fact(long a){
		long ans=1;
		for (int i = 1; i < a; i++) {
			ans=ans*i;
		}return ans;
	}

}
