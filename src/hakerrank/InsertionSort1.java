package hakerrank;//incomplete
import java.util.Scanner;
public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextInt();
			}
			int t=b[a-1];
			for (int i = a-2; i>=0; i--) {
				if(b[i]>t){b[i+1]=b[i];}
				if(b[i]<t){b[i+1]=t;}
				for (int j = 0; j < b.length; j++) {
					System.out.print(b[i]+" ");
				}System.out.println();
			}
   
 
    }

	}

