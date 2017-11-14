package hakerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Solveme {
   

   
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++){
      b[2*i]=s.nextInt();
        b[2*i+1]=s.nextInt();
    }
    for(int i=0;i<a;i++){
        int sum=b[2*i]+b[2*i+1];
        System.out.println(sum);
    }
    }}

