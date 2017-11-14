package hakerrank;
import java.util.Scanner;
public class MakeItAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				String a=s.next();
				String b=s.next();int count=0;
				char[] c1=a.toCharArray();char[] c2=b.toCharArray();
				for (int i = 0; i < c1.length; i++) {
					for (int j = 0; j < c2.length; j++) {
						if(c1[i]==c2[j]){c2[j]=0;count=count+2;break;}
					}
				}System.out.println(c1.length+c2.length-count);
	}

}
