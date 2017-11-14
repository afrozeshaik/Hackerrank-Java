package hakerrank;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		int n[]=new int[a];
		int k[]=new int[a];
		for (int i = 0; i <a; i++) {
			n[i]=s.nextInt();
			k[i]=s.nextInt();
		}for (int i = 0; i < a; i++) {
			int ans[]=new int[n[i]+1];int p=0;
			for (int j = 0; j < (n[i]+1)/2; j++) {
				ans[2*j]=n[i]-1-p;
				ans[2*j+1]=p;p++;
			}
			for (int j = 0; j < ans.length; j++) {
				if(ans[j]==k[i]){System.out.println(j);break;}
			}
		}
		
		
	}

}
