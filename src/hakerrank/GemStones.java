package hakerrank;//unsuccessful
import java.util.Arrays;
import java.util.Scanner;
public class GemStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			String S[]=new String[a];
			int c[]=new int[a];
			char[][] C=new char[a][101];
			for (int i = 0; i < S.length; i++) {
				S[i]=s.next();
				c[i]=S[i].length();
			}
			for (int i = 0; i < a; i++) {
				C[i]=S[i].toCharArray();
			}
			for (int i = 0; i < S[0].length()-1; i++) {
				for (int j = i+1; j < S[0].length(); j++) {
					if (C[0][i]==C[0][j]){C[0][j]='0';}
				}
			}
			
			int count=0;
			for (int i = 0; i <S[0].length(); i++) {
				for (int j = 1; j < a; j++) {
					if(C[0][i]!='0' && present(C[0][i],C,j)){count++;break;}
				}
			}
			System.out.println(count);
			
		}
	static boolean present(char c,char b[][],int k){
		boolean m=false;
		for (int i = 0; i < b[k].length; i++) {
			if(b[k][i]==c){m=true;break;}
		}return m;
	}
}
