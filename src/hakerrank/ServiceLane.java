package hakerrank;
import java.util.Scanner;
public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int t=s.nextInt();
			int w[]=new int[n];
			int T[]=new int[2*t];
			for (int i = 0; i < w.length; i++) {
				w[i]=s.nextInt();
			}
			for (int i = 0; i < t; i++) {
				T[2*i]=s.nextInt();
				T[2*i+1]=s.nextInt();
					
			}
			for (int i = 0; i < t; i++) {
				int min=3;
				for (int j = T[2*i]; j <=T[2*i+1]; j++) {
					if(w[j]<min){min=w[j];}
				}System.out.println(min);
			}
	}

}
