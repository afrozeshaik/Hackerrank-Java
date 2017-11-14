package Miscellaneous;
import java.util.Scanner;
public class FindHakerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			String S[]=new String[a];
			String[] words = new String[a];
			for (int i = 0; i < S.length; i++) {
				S[i]=s.next();
			
			}
			for (int i = 0; i < S.length; i++) {
				int intIndex = S[i].indexOf("hakerrank");
				if(intIndex==0){System.out.println(1);}
			}
	}

}
//string.split("\\s+");