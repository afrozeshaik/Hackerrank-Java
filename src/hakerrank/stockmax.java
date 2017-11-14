package hakerrank;

import java.util.Scanner;

public class stockmax {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int ar[]=new int[n];
            for(int j=0;j<n;j++){
                ar[j]=s.nextInt();
            }
            long profit=0;int max=Integer.MIN_VALUE;
            for(int j=n-1;j>=0;j--){
                if(ar[j]>max){
                    max=ar[j];
                }
                else{
                    profit=profit+max-ar[j];
                }
                
            }
            System.out.println(profit);
        }
    }
}