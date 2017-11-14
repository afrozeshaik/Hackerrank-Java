package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class Acm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			long l[]=new long[4];
			for (int i = 0; i < l.length; i++) {
				l[i]=s.nextLong();
			}int d[][]=new int[a][b];
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					d[i][j]=(int) (l[i]%10);
					l[i]=l[i]/10;
				}
				
			}long k=ncr(a,2);
			long max[]=new long[(int) k];int z=0;
			for (int i = 0; i < a-1; i++) {
				for (int j = i+1; j <a; j++) {
					for (int p = 0; p < b; p++) {
						if(d[i][p]==1 || d[j][p]==1){max[z]++;}
					}z++;
				}
			}
			Arrays.sort(max);
			System.out.println(max[(int) (k-1)]);int count=0;
			for (long i = k-1; i >=0; i--) {
				if(max[(int) i]==max[(int) (k-1)]){count++;}
				else{break;}
			}System.out.println(count);
			
	}
		static long ncr(long a,long b){
			long ans=1;
			 ans=fact(a)/(fact(a-b)*fact(b));
			return ans;
		}static long fact(long a){
			long ans=1;
			for (int i = 1; i < a; i++) {
				ans=ans*i;
			}return ans;
		}
}
