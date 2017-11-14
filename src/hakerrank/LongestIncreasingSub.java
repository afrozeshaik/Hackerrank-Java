package hakerrank;    
import java.util.Scanner;

    public class  LongestIncreasingSub
    {
        public int[] lis(int[] X)
        {        
            int n = X.length - 1;
            int[] M = new int[n + 1];  
            int[] P = new int[n + 1]; 
            int L = 0;
            for (int i = 1; i < n + 1; i++)
            {int j = 0;
                for (int pos = L ; pos >= 1; pos--)
                {
                    if (X[M[pos]] < X[i])
                    {
                        j = pos;
                        break;
                    }
                }            
                P[i] = M[j];
                if (j == L || X[i] < X[M[j + 1]])
                {
                    M[j + 1] = i;
                    L = Math.max(L,j + 1);
                }
            }
            /** backtrack **/
            int[] result = new int[L];
            int pos = M[L];
            for (int i = L - 1; i >= 0; i--)
            {
                result[i] = X[pos];
                pos = P[pos];
            }
            return result;             
        }
        /** Main Function **/
        public static void main(String[] args) 
        {    
            Scanner scan = new Scanner(System.in);  
            int n = scan.nextInt();
            int[] arr = new int[n + 1];
            
            for (int i = 1; i <= n; i++)
                arr[i] = scan.nextInt();
            LongestIncreasingSub obj = new LongestIncreasingSub(); 

            int[] result = obj.lis(arr);      
            System.out.println(result.length);

        }

    }


