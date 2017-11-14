package hakerrank;
import java.util.Scanner;
public class lonely {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a = s.nextInt();
int b[]=new int[a];
int c[]=new int[100];
int d=0;
for(int i =0;i<a;i++){
	b[i]=s.nextInt();
		}
for (int i = 0; i < b.length; i++) {
	for (int j = 0; j < b.length; j++) {
		if(b[i]==b[j]){c[i]++;}
	}for (int j = 0; j < c.length; j++) {
		if(c[j]==1){d=j;break;}
	}
	
}System.out.println(b[d]);
	}
}