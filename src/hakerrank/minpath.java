package hakerrank;//incomplete
import java.util.Scanner;
public class minpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[][]=new int[a][a];
for (int i = 0; i < a; i++) {
	for (int j = 0; j <a; j++) {
		b[i][j]=s.nextInt();
	}
}
int sum[]=new int[a];
for (int i = 0; i <a; i++) {
	sum[0]=sum[0]+b[0][i];
}
for (int i = a-1; i>0; i--) {
	int k=0;int key=b[i][k];sum[i]=key;
	while(k<a){
		if(b[i][k+1]>b[i-1][k]){sum[i]=sum[i]+b[i-1][k];}
		else{sum[i]=sum[i]+b[i][k+1];k++;}
		
	}
}
	}

}
