package hakerrank;
import java.util.Scanner;
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String S=s.nextLine();
S.replaceAll("\\s+", "");


char c[]=S.toCharArray();
int len=c.length;

			int w=(int) Math.floor(Math.sqrt(len));
			int h=(int)Math.ceil(Math.sqrt(len));
			long minarea=S.length();
			
			int l=w;int b=w;
			if(l*b<minarea){l=l+1;}
			if(l*b<minarea){b=b+1;}
			
			char ans[][]=new char[b][l];
			int k=0;
			for (int i = 0; i < b; i++) {
				for (int j = 0; j < l; j++) {
					if(k>len-1){ans[i][j]=0;}
					else{ans[i][j]=c[k];k++;}
				}
			}
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < b; j++) {
					if(ans[j][i]==0){}
					else{System.out.print(ans[j][i]);}
				}System.out.print(" ");
			}
			
	}

}
