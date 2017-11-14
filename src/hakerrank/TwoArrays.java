package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();int ans[]=new int[t];
			for (int i = 0; i < t; i++) {
				ans[i]=1;
				int m=s.nextInt();
				int k=s.nextInt();
				int a[]=new int[m];
				int b[]=new int[m];
				for (int j = 0; j < b.length; j++) {
					a[j]=s.nextInt();
				}
				for (int j = 0; j < b.length; j++) {
					b[j]=s.nextInt();
				}
				Arrays.sort(a);
				Arrays.sort(b);
				for (int j = 0; j < b.length; j++) {
					if(a[j]+b[m-j-1]<k){ans[i]=0;break;}
				}
			}
			for (int i = 0; i < ans.length; i++) {
				if(ans[i]==1){System.out.println("YES");}
				else{System.out.println("NO");}
			}
	}

}
