package hakerrank;
import java.util.Scanner;
public class LoveletterMystery {

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
				for (int j = 0; j < c.length/2; j++) {
					if((int)c[j]>(int)c[c.length-1-j]){count =count+(int)c[j]-(int)c[c.length-1-j];}
					else{count =count+(int)c[c.length-1-j]-(int)c[j];}
					
				}System.out.println(count);
			}
	}

}
