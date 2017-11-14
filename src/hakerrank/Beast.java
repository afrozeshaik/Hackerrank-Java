package hakerrank;
import java.util.Scanner;
public class Beast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			Long b[]=new Long[a];
			for (int i = 0; i < b.length; i++) {
				b[i]=s.nextLong();
			}
			for (int i = 0; i<a; i++) {boolean c=true;
				for (int j = 0; j <=b[i]; j++) {
					long m=j%5;long n=(b[i]-j)%3;
					if(m==0&&n==0){c=false;for (int k = 0; k < b[i]-j; k++) {System.out.print(5);	
					}for (int k = 0; k <j; k++) {
						System.out.print(3);
					}break;
					}
					
				}if(c==true){System.out.println(-1);}
			}
					
	
	}
	}


