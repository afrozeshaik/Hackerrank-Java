package hakerrank;
import java.util.Scanner;
public class ManasaAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int n[]=new int[t];
int a[]=new int[t];
int b[]=new int[t];
for (int i = 0; i <t; i++) {
	n[i]=s.nextInt();
	a[i]=s.nextInt();
	b[i]=s.nextInt();
}		for (int i = 0; i <t; i++) {int sum=0;
			if(a[i]==b[i]){System.out.println((n[i]-1)*a[i]);}
			else if(a[i]>b[i]){
				for (int j = 0; j < n[i]; j++) {sum=0;
					sum=a[i]*j+b[i]*(n[i]-1-j);
					System.out.print(sum+" ");
				}System.out.println();
			}
			else{
				for (int j = 0; j < n[i]; j++) {
					sum=0;sum=b[i]*j+a[i]*(n[i]-1-j);
					System.out.print(sum+" ");
				}System.out.println();
			}
					}
	}

}
