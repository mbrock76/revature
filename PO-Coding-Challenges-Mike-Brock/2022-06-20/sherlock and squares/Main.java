
import java.util.*;

public class Main{
    
    public static int countSqrt(int l, int a, int b, int[] arr){
        
        int count = 0;
        
        for(int each:arr){
            
            if(each >= a && each <= b && Math.sqrt(each)%1 == 0){
                
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        //INPUT: one line, space seperated integers, 1: array length, 2: range start, 3: range end, 4-n: array
        //7 24 49 1 4 9 16 25 36 49
        int l = scnr.nextInt();
        int a = scnr.nextInt ();
        int b = scnr.nextInt ();
        
        int[] arr = new int[l];
        for (int i = 0; i < l; i++)
        {
            arr[i] = scnr.nextInt();
        }
    
        scnr.close ();
        
        System.out.println(countSqrt(l, a, b, arr));
    }
}
