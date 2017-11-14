package hakerrank;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args){
Scanner s = new Scanner(System.in);
int a =s.nextInt();
int d[]=new int[a];

for (int i = 0; i <a; i++) {
	d[i]=s.nextInt();
}

for (int i = 0; i <a; i++) {
	int count=0;
	int z=3;
	
		for (int j = 2; j < z; j++) {
			for (int k = 2; k < j; k++) {
				if(i%k==0){break;}
				else if(k==i-1 && i%k!=0){count++;}
				if(count==d[i]){System.out.println(j);break;}
				z++;
				
			}
		
	}

	}


	}}
