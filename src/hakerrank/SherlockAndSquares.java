package hakerrank;
import java.util.Scanner;
public class SherlockAndSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[2*a];
for (int i = 0; i < a; i++) {
	b[2*i]=s.nextInt();
	b[2*i+1]=s.nextInt();
}
for (int i = 0; i <a; i++) {int c=0;
			int ans=(int) Math.sqrt(b[2*i]);int k=ans*ans;
			if(ans*ans==b[2*i]){c=c+1;}
			while(k<=b[2*i+1]){
				k=k+2*ans+1;ans++;c++;
			}System.out.println(c-1);
			
}
	}

}
