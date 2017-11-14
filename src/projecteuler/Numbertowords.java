package projecteuler;

import java.util.Scanner;

public class Numbertowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
long b[]=new long[a];for (int i = 0; i < b.length; i++) {
	b[i]=s.nextLong();
}
		for (int i = 0; i < b.length; i++) {
			if(b[i]<20){
				if(b[i]==1){System.out.println("one");}if(b[i]==18){System.out.println("one");}
				else if(b[i]==2){System.out.println("two");}if(b[i]==19){System.out.println("one");}
				else if(b[i]==3){System.out.println("three");}
				if(b[i]==4){System.out.println("four");}
				if(b[i]==5){System.out.println("five");}
				if(b[i]==6){System.out.println("six");}
				if(b[i]==7){System.out.println("seven");}
				if(b[i]==8){System.out.println("eight");}
				if(b[i]==9){System.out.println("nine");}
				if(b[i]==10){System.out.println("ten");}
				if(b[i]==11){System.out.println("eleven");}
				if(b[i]==12){System.out.println("tweleve");}
				if(b[i]==13){System.out.println("thirteen");}
				if(b[i]==14){System.out.println("fourteen");}
				if(b[i]==15){System.out.println("fifteen");}
				if(b[i]==16){System.out.println("sixteen");}
				if(b[i]==17){System.out.println("seventeen");}
			}}
			for (int j = 0; j < b.length; j++) {
				int k=0;
				while(b[j]>0){
				long p=b[j]/10;}
			}
		
	}

}
