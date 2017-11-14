package hakerrank;
import java.util.Scanner;
public class SubStringdivisibility {
	public static void main(String[] args){
Scanner s= new Scanner(System.in);
int a = s.nextInt();
int d[]=new int[11];
int sum=0;
for(int j=0;j<=Math.pow(10,a);j++){
	int k=j;
	for (int i = a; i >= a; i--) {
		d[i]=k%10;
		k=k/10;
	}
	if(((d[2]*100+d[3]*10+d[4])%2==0)&&((d[3]*100+d[4]*10+d[5])%3==0)&&
			((d[4]*100+d[5]*10+d[6])%5==0) &&(((d[5]*100 +d[6]*10)+d[7])%7==0)&&
			(((d[6]*100+d[7]*10)+d[8])%11==0) &&(((d[7]*100+d[8]*10)+d[9])%13==0)&&
			(((d[8]*100+d[9]*10)+d[10])%17==0)){sum=sum+j;}
}System.out.println(sum);
}
}
