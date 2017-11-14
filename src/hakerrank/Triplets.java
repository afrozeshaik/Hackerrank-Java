package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.nextInt();
}Arrays.sort(b);
int count=0;		
for (int i = 0; i < b.length-2; i++) {
			if(i>0&&b[i]==b[i-1]){i++;}
			
			for (int j = i+1; j < b.length-1; j++) {
				{if(j>1&&b[j]==b[j-1]){j++;}}
				
				for (int k = j+1; k < b.length; k++) {
					{if(k>2&&b[k]==b[k-1]){j++;}}
					if(b[k]>b[j]&&b[j]>b[i]){count++;}
				}
			}
	
}System.out.println(count);
	}

}
