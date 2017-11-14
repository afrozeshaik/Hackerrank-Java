package hakerrank;
import java.util.Scanner;
public class AlternatingCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			String S[]=new String[a];
			for (int i = 0; i < S.length; i++) {
				S[i]=s.next();
			}
			for (int i = 0; i < S.length; i++) {
				char c[]=S[i].toCharArray();int count=0;
				for (int j = 0; j < c.length-1; j++) {
					if(c[j]=='A'&&c[j+1]=='A'){c[j+1]='A';count++;}
					if(c[j]=='B'&&c[j+1]=='B'){c[j+1]='B';count++;}
				}System.out.println(count);
			}
	}

}
