
import java.util.*;
import java.util.stream.Collectors;

public class Main{
    
    public static void printMedian(String[] lines){
        
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(String each:lines){
            temp.addAll(Arrays.stream(each.split("[^0-9]")).map(Integer::valueOf).collect(Collectors.toList()));
        }
        Collections.sort(temp);
        
        double median = 0.0;
        if(temp.size() % 2 == 0){

            median = ((double)temp.get((temp.size()/2)-1) + (double)temp.get(temp.size()/2))/2;
        }else{
            
            median = temp.get((int)temp.size()/2);
        }
        
        System.out.println("The median of " + Arrays.toString(temp.toArray()) + " is " + median);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter one line of data for each array, where the numbers are separated by a non-number:");
        
        String[] lines = new String[2];
        int i = 0;
        while(i < 2){
            lines[i] = sc.nextLine();
            i++;
        }
        
        sc.close ();

        printMedian(lines);
        
    }
}