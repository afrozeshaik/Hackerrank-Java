package projecteuler;

import java.util.Scanner;

public class SpecialPythagorian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();int ar[]=new int[a];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=s.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {long prod=1;
		boolean b=false;
        for ( int k=3 ; k<=ar[i]; k++) {
            for (int j = a + 1; j < ar[i]; j++) {
               
                double cSquared = Math.pow(k, 2) + Math.pow(j, 2);
                double c = Math.pow(cSquared, 0.5);
               
                if (k + j+ c == ar[i]) {b=true;
                    if((k*j*c)>prod){prod=(long) (k*j*c);}
                    
                }
            }
        }if(b){System.out.println(prod);}
        else{System.out.println(-1);}
	}
		}

}
