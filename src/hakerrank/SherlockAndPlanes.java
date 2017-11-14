package hakerrank;
import java.util.Scanner;
public class SherlockAndPlanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[][]=new int[a][12];
for (int i = 0; i < a; i++) {
	for (int p = 0; p < 12; p++) {
		b[i][p]=s.nextInt();
	}
	
}for (int i = 0; i <a; i++) {
	b[i][0]=b[i][0]-b[i][9];b[i][1]=b[i][1]-b[i][10];b[i][2]=b[i][2]-b[i][11];
	b[i][3]=b[i][3]-b[i][9];b[i][4]=b[i][4]-b[i][10];b[i][5]=b[i][8]-b[i][11];
	b[i][6]=b[i][6]-b[i][9];b[i][7]=b[i][7]-b[i][10];b[i][8]=b[i][8]-b[i][11];
	
}/*for (int i = 0; i < a; i++) {
	for (int j = 0; j < 4; j++) {
		System.out.print(b[i][3*j]+" ");
		System.out.print(b[i][3*j+1]+" ");
		System.out.print(b[i][3*j+2]+" ");
	}System.out.println();
}*/

for (int i = 0; i < a; i++) {
	int ans=1;
	 ans =b[i][0]*((b[i][4]*b[i][8])-(b[i][5]*b[i][7]))-b[i][1]*(b[i][8]*b[i][3]-b[i][5]*b[i][6])+
			b[i][2]*(b[i][3]*b[i][7]-b[i][6]*b[i][4]);
	if(ans==0){System.out.println("YES");}
	else{System.out.println("NO");}
}
	}

}
