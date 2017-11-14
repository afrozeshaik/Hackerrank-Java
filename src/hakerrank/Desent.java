package hakerrank;
import java.util.Scanner;
public class Desent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int a=s.nextInt();
			double b[]=new double[a];
			if(!desent(555)){System.out.println("yes");}
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextDouble();
				}
			for (int i = 0; i < b.length; i++) {
				
			double k=(int) Math.pow(10,b[i] )-1;
			double z=(int) Math.pow(10, b[i]-1);
				for (double j = k; j >z; j--) {
					if(desent(j)){System.out.println(j);
					break;}
					else if(j==z+1&&desent(j)==false){System.out.println(-1);break;}
				}
			}
	}
	public static boolean desent(double j){
	double v=j;int three=0;int five=0;
	while(v!=0){
		double z=v%10;
		v=v/10;
		if(z==3){three++;}else if(z==5){five++;}
		else if(z!=3 || z!=5){return false;}
	}
	if(three%5==0&&five%3==0){return true;}
	else return false;}
}
