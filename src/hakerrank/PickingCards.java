package hakerrank;//error
import java.util.Arrays;
import java.util.Scanner;
public class PickingCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
int c[][]=new int[a][50000];
for (int i = 0; i <a; i++) {
	b[i]=s.nextInt();
	for (int j = 0; j < b[i]; j++) {
		c[i][j]=s.nextInt();
	}
}
			for (int i = 0; i <a; i++) {boolean n=true;long sum=0;
				Arrays.sort(c[i]);
				for (int j = 0; j < c.length; j++) {
					if(c[i][j]>j){n=false;break;}
				}
				if(n){
							for (int j = 0; j < c[i].length-1; j++) {
								int count=1;
								if(c[i][j]==c[i][j+1]){count++;}
								else{sum=sum+fact(count);count=1;}
							}
							
				}if(n){System.out.println(sum);}
				else{System.out.println(0);}
			}
	}
static long fact(long k){
	long ans=1;
	for (int i = 1; i <=k; i++) {
		ans =ans*i;
	}return ans;
}
}
