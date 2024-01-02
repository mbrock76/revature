
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void mergeLists(int k, String[] lines){
        
        LinkedList<Integer>[] tempLines = new LinkedList[k];
        LinkedList<Integer> mergedList = new LinkedList<Integer>();
        
        //creating the array of linked lists as per instructions, could have made one list and sorted it
        for(int i = 0; i < lines.length; i++){
            
            tempLines[i] = new LinkedList<Integer>(Arrays.stream(lines[i].split("[^0-9]")).map(Integer::valueOf).collect(Collectors.toList()));
            mergedList.addAll(tempLines[i]);
        }
        Collections.sort(mergedList);
        
        System.out.println(Arrays.toString(mergedList.toArray()));
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number of linked lists to be merged:");
        int k = sc.nextInt();
        sc.nextLine();//flush \n character
        
        System.out.println("Enter one line of data for each list, where the numbers are separated by a non-number:");
        
        String[] lines = new String[k];
        int i = 0;
        while(sc.hasNextLine() && i < k){
            lines[i] = sc.nextLine();
            i++;
        }
        sc.close ();
        

        mergeLists(k, lines);
        
    }
}
