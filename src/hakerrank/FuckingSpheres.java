package hakerrank;
import java.util.Scanner;
public class FuckingSpheres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int r1[]=new int[a];
int r2[]=new int[a];
int p1[][]=new int[a][3];
int p2[][]=new int[a][3];
int a1[][]=new int[a][3];
int a2[][]=new int[a][3];
		for (int i = 0; i < a; i++) {
			r1[i]=s.nextInt();
			r2[i]=s.nextInt();
			for (int j = 0; j < 3; j++) {
				p1[i][j]=s.nextInt();
			}
			for (int j = 0; j < 3; j++) {
				a1[i][j]=s.nextInt();
			}
			for (int j = 0; j < 3; j++) {
				p2[i][j]=s.nextInt();
			}
			for (int j = 0; j < 3; j++) {
				a2[i][j]=s.nextInt();
			}
		}
		for (int i = 0; i <a; i++) {
			int p=(p1[i][0]-p2[i][0])*(p1[i][0]-p2[i][0])+(p1[i][1]-p2[i][1])*(p1[i][1]-p2[i][1])+
					(p1[i][2]-p2[i][2])*(p1[i][2]-p2[i][2]);
			int q=(a1[i][0]-a2[i][0])*(a1[i][0]-a2[i][0])+(a1[i][1]-a2[i][1])*(a1[i][1]-a2[i][1])+
					(a1[i][2]-a2[i][2])*(a1[i][2]-a2[i][2]);
			int dx=(p1[i][0]-p2[i][0]);int ax=(a1[i][0]-a2[i][0]);
			int dy=(p1[i][1]-p2[i][1]);int ay=(a1[i][1]-a2[i][1]);
			int dz=(p1[i][2]-p2[i][2]);int az=(a1[i][2]-a2[i][2]);
			int r=dx*ax+dy*ay+dz*az;
			int l=(r1[i]+r2[i])*(r1[i]+r2[i]);
			int n=p-l;
			if((n<0)&&(4*r*r-(q*n)<0)){System.out.println("yes");}
			else{System.out.println("no");}
		}
	}

}
