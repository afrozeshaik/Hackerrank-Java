package hakerrank;
import java.util.Scanner;
public class UtopianTree {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b[]= new int[10];
	for(int i=0;i<a;i++){
		b[i]=s.nextInt();
	}
	for (int i = 1; i <= a; i++) {
		int l=1;
		if(b[i-1]%2==0){for (int j = 1; j <=(b[i-1])/2; j++) {
			l=2*l+1;
		}}
		else if(b[i-1]==1){l=2;}
		else{for (int j = 0; j<(b[i-1])/2; j++) {
			l=2*l+1;
		}l=2*l;}
		System.out.println(l);
		
	}
}
}



		/*if(b[i]%2==0){l=(int) ((Math.pow(2, b[i]/2) + b[i]/2));}
		else{l=(int) Math.pow(2, (b[i]+1)/2) + (b[i]-1)/2;}
		System.out.println(l);*/