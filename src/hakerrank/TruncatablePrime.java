package hakerrank;
import java.util.Scanner;
public class TruncatablePrime {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for (int i = 10; i <a; i++) {
			if(truncatable(i)&&prime(i)){sum=sum+i;System.out.println(i);;}
		}System.out.println(sum);
		
		}public static boolean prime(int k){
			boolean b=true;
			for (int i = 2; i <k; i++) {
				if(k%i==0){b=false;break;};
			}return b;

	}
		public static boolean truncatable(int k){
			int v=k;boolean b=true;int p=1;
			while(v>=10){	
				int r=(int) (k%Math.pow(10, p));
				if(!prime(r)){b=false;}
				v=(int) (k/Math.pow(10, p));
				if(!prime(v)){b=false;}
				p++;
			}
			return b;}
}
		
		//3797, 797, 97, and 7.   3797, 379, 37, and 3.
		
/*Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b[]=new int[10];
	int c[]=new int[10];
	int d[]=new int[10];
	int sum=0;
	for (int i = 0; i <a; i++) {
		int z=i;
		
		int k=0;
		while(z!=0){b[k]=z%10;
		z=z/10;
		c[k]=z;k++;
		}
		int h=i;
		int m=k;
		while(h!=0){h=(int) (h%(Math.pow(10, m)));
		d[m]=h;
		m--;}
		boolean l1=true;boolean l2=true;
		for (int j = 0; j <k; j++) {
			l1=prime(c[i])&&l1&&prime(i);
		}
		for (int j = 0; j < k; j++) {
			l2=prime(d[j])&&l2;
		}if(l1&&l2){sum=sum+i;}
		
	}System.out.println(sum);
	}
	public static boolean prime(int k){
		boolean b=true;
		for (int i = 2; i <k; i++) {
			if(k%i==0){b=false;break;};
		}if(b=true){return true;}
		else return false;
	*/