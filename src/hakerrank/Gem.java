package hakerrank;

import java.util.Scanner;

public class Gem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String b[]=new String[a];
char c[][]=new char[a][105];
int d[]=new int[a];
for (int i = 0; i < b.length; i++) {
	b[i]=s.next();
	d[i]=b[i].length();
}				for (int i = 0; i <a; i++) {
	c[i]=b[i].toCharArray();
}		for (int i = 0; i < b[0].length()-1; i++) {
			if(c[0][i]!= 0){
			for (int j =i+1; j < d[0]; j++) {
				if(c[0][i]==c[0][j]){c[0][j]=0;}
			}
}}int count=0;
		for (int i = 0; i < d[0]; i++) {
			if(c[0][i]!=0){
			for (int j = 1; j < a; j++) {
				if(present(c[0][i],c,j)){count++;break;}
			}	
			}
		}System.out.println(count);
			
	}
	static boolean present(char c,char a[][],int k){
		boolean b=false;
		for (int i = 0; i < a[k].length; i++) {
			if(a[k][i]==c){b=true;break;}
		}return b;
	}
}
