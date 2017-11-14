package hakerrank;//incomplete
import java.util.Arrays;
import java.util.Scanner;
public class SherlockAndPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];
long c[][]=new long[a][100000];
for (int i = 0; i < a; i++) {
	b[i]=s.nextLong();
	for (int j = 0; j <b[i]; j++) {
		c[i][j]=s.nextLong();
	}
}		for (int i = 0; i < a; i++) {
			Arrays.sort(c[i]);int count=0;
			for (int j = 0; j <b[i]; j++) {
				for (int k = 0; k < b[i]; k++) {
					if(c[i][k]>c[i][j]){break;}
					if((k!=j)&&(c[i][j]==c[i][k])){count++;}
				}
			}System.out.println(count);
	
}
	}

}
//if(c[i][k]>c[i][j]){break;}