package hakerrank;
import java.util.Scanner;
public class Bread {
	public static void main(String[] args){
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int l[]=new int[a];
int b[]=new int[a];
int g[]=new int[a];
for (int i = 0; i <a; i++) {
	l[i]=s.nextInt();
	b[i]=s.nextInt();
}
for (int i = 0; i <a; i++) {
	for (int j = 1; j <= min(l[i],b[i]); j++) {
		if(l[i]%j==0 && b[i]%j==0){g[i]=j;}
	}System.out.println((l[i]/g[i])*(b[i]/g[i]));
}
}
	public static int min(int a,int b){
		if(a>b)
		return b;
		else
			return a;}
}