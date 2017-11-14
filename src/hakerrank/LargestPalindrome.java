package hakerrank;
import java.util.Scanner;
public class LargestPalindrome {
	public static void main(String[] args){
Scanner s =new Scanner(System.in);
int a = s.nextInt();
int d[]=new int[a];
boolean l=false;
for (int i = 0; i < a; i++) {
	d[i]=s.nextInt();
	
		}
		for (int i = 0; i < a; i++) {
			l=false;
			for (int j = d[i]-1; j > 0; j--) {
				for (int k = 100;  k< 1000; k++) {
					if(j%k==0&&palindrome(j)&&j/k<1000){
						l=true;
						System.out.println(j);
						break;
					}if(l==true){break;}
				}
			}
		}
	}public static boolean palindrome(int k){
		if(k==reverse(k)){return true;}
		else{return false;}}
	public static int reverse(int num) {
	        int revNum = 0;
	        while (num > 0) {
	            int rem = num % 10;
	            revNum = (revNum * 10) + rem;
	            num = num / 10;
	        }
	        return revNum;
	    }
}
