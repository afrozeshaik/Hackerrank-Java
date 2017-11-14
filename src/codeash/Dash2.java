package codeash;
import java.util.Scanner;
public class Dash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
int c[]=new int[a];
for (int i = 0; i < c.length; i++) {
	b[i]=s.nextInt();
	c[i]=s.nextInt();
}for (int i = 0; i < c.length; i++) {int count=0;
	for (int j = b[i]; j <= c[i]; j++) {
		
		if(IsSquare(j)){count++;}
	}System.out.println(count);
}
	}
	public static boolean IsSquare(long target)
	{
	    // loop through all the numbers till the target
	    for (long i = 0; i < target; i++)
	    {
	        // if we have a match
	        if ((i * i) == target)
	        {
	            return true;
	        }
	    }

	    // no matching number could be squared
	    return false;
	}
}
