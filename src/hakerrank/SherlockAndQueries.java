package hakerrank;
import java.util.Scanner;
public class SherlockAndQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int A[]=new int[a];
int B[]=new int[b];
int C[]=new int[b];int l=1000000007;
for (int i = 0; i < a; i++) {
	A[i]=s.nextInt();
}for (int i = 0; i < C.length; i++) {
	B[i]=s.nextInt();
}
for (int i = 0; i < C.length; i++) {
	C[i]=s.nextInt();
}

		for (int i = 1; i < b; i++) {
			for (int j = 1; j < a; j++) {
				if(j%B[i]==0){A[j]=((A[j]%l)*(C[i]%l))%l;}
			}
		}for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}

}
