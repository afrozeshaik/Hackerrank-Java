package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class FindtheMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			int k[]=new int[a];
			for (int i = 0; i < a; i++) {
				k[i]=s.nextInt();
			}
			Arrays.sort(k);int ans=0;
			if(a%2==0){int z=a/2; ans=(k[z]+k[z-1])/2;}
			else{int z=a/2; ans=k[z];}
			System.out.println(ans);
	}

}
