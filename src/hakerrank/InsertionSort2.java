package hakerrank;//incomplete
import java.util.Scanner;
public class InsertionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b[]=new int[a];
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextInt();
			}
			for (int i = 1; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if(b[j]>b[i]){int temp=b[i];b[i]=b[j];b[j]=temp;}
				}
			}
	}

}
