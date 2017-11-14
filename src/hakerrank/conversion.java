package hakerrank;
import java.util.Scanner;
public class conversion {public static void main(String[] args ){
Scanner s= new Scanner(System.in);
int a= s.nextInt();
System.out.println(Converter(3,10));
}
public static int Converter(int Nbase, int Nnumber){

    int answer;
    int Rcontainer =0;
    int cnt = 0;
    int multiplier;
    int temp;
    double exp;

    if(Nnumber/Nbase == 0){
        cnt++;
        exp = Math.pow(10,cnt); 
        multiplier = (int)exp;
         answer = (Nnumber%Nbase)* multiplier + Rcontainer;


    }
    else
      {
       exp = Math.pow(10,cnt);
       multiplier = (int)exp;
       cnt++;
       temp = Rcontainer;
       Rcontainer = (Nnumber%Nbase)* multiplier + temp;   

       Nnumber = Nnumber/Nbase;
        answer = Converter(Nbase,Nnumber);
       }  
        return answer;
}
	}
