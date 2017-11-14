package hakerrank;

import java.util.Scanner;
public class Hallowen {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int a = s.nextInt();
       long b[]= new long[a];
        for(int i =0;i<a;i++){
            b[i]=s.nextLong();
        }
        for(int j=0;j<a;j++){
            if(b[j]%2==0){System.out.println(b[j]*b[j]/4);}
            else{System.out.println((b[j]/2)*(b[j]/2 +1));}
       }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
