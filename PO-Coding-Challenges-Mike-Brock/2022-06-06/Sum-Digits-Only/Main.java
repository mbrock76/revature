
import java.util.*;

public class Main
{
    public static void sumDigits(int N, String[] lines){
        
        for(int i = 0; i < N; i++){
            
            char[] temp = lines[i].replaceAll("[^0-9]", "").toCharArray();
            int sum = 0;

            for(char each:temp){
                sum += Integer.parseInt(String.valueOf(each));
            }
            System.out.println(sum);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the number of lines of input data: ");
        int N = sc.nextInt();
        String[] lines = new String[N];
        
        System.out.println("Enter your data input one line at a time:");
        int i = 0;
        while(sc.hasNextLine() && i < N){
            lines[i] = sc.next();
            i++;
        }
        
        sc.close ();
        
        sumDigits(N, lines);
        
    }
}
