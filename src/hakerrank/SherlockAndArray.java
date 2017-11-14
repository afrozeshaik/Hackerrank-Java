package hakerrank;
import java.util.Scanner;
public class SherlockAndArray {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int c[][]=new int[a][100000];
	int d[]=new int[a];
	for (int i = 0; i < a; i++) {
		d[i]=s.nextInt();
		for (int j = 0; j < d[i]; j++) {
			c[i][j]=s.nextInt();
		}
		
	}for (int i = 0; i <a; i++) {boolean b=true;
		for (int j = 0; j < d[i]; j++) {
			int lsum=0;int rsum=0;
			if(j==d[i]-1){rsum=0;}else{
			for (int k =j+1; k < d[i]; k++) {
				rsum=rsum+c[i][k];}}
			if(j==0){lsum=0;}else{for (int k = 0; k <j; k++) {
				lsum=lsum+c[i][k];}
			}if(lsum==rsum){b=false;System.out.println("YES");break;}
		}if(b){System.out.println("NO");}
	}
	
	
}

}
/*for (int i = 0; i < a; i++) {boolean b=false;
		for (int j = 0; j < d[i]; j++) {
			int rsum=0;int lsum=0;
			if(j==d[i]-1){rsum=0;}else{
			for (int k = j+1; k < d[i]; k++) {
				rsum=rsum+c[i][k];}}
				
				if(j==0){lsum=0;}else{
			for (int p = j; p >=0; p--) {
				lsum=lsum+c[i][p];
			}}if(lsum==rsum){System.out.println("YES");b=true;break;}
		}if(b=false){System.out.println("NO");}
	}*/