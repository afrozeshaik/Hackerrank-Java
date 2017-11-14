package hakerrank;

import java.math.*;

import java.util.Scanner;

public class ModifiedFibonacci {



public static void main(String[] args) {

// TODO Auto-generated method stub

Scanner s= new Scanner(System.in);

BigInteger a=s.nextBigInteger();

BigInteger b=s.nextBigInteger();

int n=s.nextInt();

BigInteger k[]=new BigInteger[20];

k[0]=a;k[1]=b;

for (int i = 2; i <n; i++) {

k[i]=(k[i-1].multiply(k[i-1])).add(k[i-2]);

}System.out.println(k[n-1]);

}



}