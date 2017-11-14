package hakerrank;
import java.util.Scanner;
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
String inputString=s.nextLine();
if(isPangram(inputString)){System.out.println("pangram");}
else{System.out.println("not pangram");}

	}

	public static boolean isPangram(String test){
        for (char a = 'A'; a <= 'Z'; a++)
            if ((test.indexOf(a) < 0) && (test.indexOf((char)(a + 32)) < 0))
                return false;
        return true;
    }
}
