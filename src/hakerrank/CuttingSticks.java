package hakerrank;
import java.util.Arrays;
import java.util.Scanner;
public class CuttingSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextInt();
			}
			Arrays.sort(b);
			while(b[b.length-1]!=0){int count=0;
				for (int i = 0; i < b.length; i++) {
					if(b[i]!=0){count++;}
				}System.out.println(count);
				int k=min(b);
				for (int i = 0; i < b.length; i++) {
					if(b[i]!=0){b[i]=b[i]-k;}
				}
			}
	}

	static int min(int a[]){
		Arrays.sort(a);int min=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0){ min=a[i];break;}
		}return min;
		
	}
}
