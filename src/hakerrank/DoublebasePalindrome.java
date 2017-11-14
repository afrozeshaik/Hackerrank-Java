package hakerrank;
/*import java.util.Scanner;
public class DoublebasePalindrome {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int sum=0;
	for (int i = 1; i <= a; i++) {
		
		//System.out.println((Converter(b,i)));
		//System.out.println(palindrome(i));
		;
		if(palindrome(i)&&palindrome(fromDecimal(i,b))){sum=sum+i;;}
	}
	System.out.println(sum);
	}
public static boolean palindrome(int k){
	if(k==reverse(k)){return true;}
	else{return false;}}
public static long reverse(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
     
}string DecimalToBase(int iDec, int numbase)
{
    string strBin = "";
    int[] result = new int[32];
    int MaxBit = 32;
    for(; iDec > 0; iDec/=numbase)
    {
        int rem = iDec % numbase;
        result[--MaxBit] = rem;
    } 
    for (int i=0;i<result.Length;i++)
          if ((int) result.GetValue(i) >= base10)
            strBin += cHexa[(int)result.GetValue(i)%base10];
          else
            strBin += result.GetValue(i);
    strBin = strBin.TrimStart(new char[] {'0'});
    return strBin;
}

}*/