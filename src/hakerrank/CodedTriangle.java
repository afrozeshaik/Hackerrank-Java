package hakerrank;
import java.util.Scanner;
public class CodedTriangle {
	public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a = s.nextInt();
int t[]= new int[a];
		for (int i = 0; i < a; i++) {
			t[i]=s.nextInt();
		}for (int i = 0; i <a; i++) {		
		for (int k = 0; k < t[i]; k++) {
			if(t[i]==0){System.out.println(-1);break;}
			else if(t[i]==1){System.out.println(1);break;}
			else if(((k)*(k+1))/2==t[i]){System.out.println(k);break;}
			else if(k==(t[i]-1)&&((k)*(k+1))/2!=t[i]&&t[i]!=1){System.out.println(-1);break;}
		}
		}

}
}//1,3,6,10,15,21,28,36,45,55,