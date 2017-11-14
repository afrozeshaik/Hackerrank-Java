package hakerrank;

import java.util.Scanner;
import java.util.Arrays;
public class Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner in = new Scanner(System.in);
	      Scanner in=new Scanner(System.in);
	      int N, K;
	      N = in.nextInt();
	      K = in.nextInt();
	      
	      int C[] = new int[N];
	      for(int i=0; i<N; i++){
	         C[i] = in.nextInt();
	      }
	      Arrays.sort(C);
	      
	      int res=0;
	      int x=0;
	      int k=0;
	      	for (int i = C.length-1; i >=0; i--) {
				res=res+(x+1)*C[i];k++;
				if(k%K==0){x++;}
			}System.out.println(res);

	}

}
