
// This is a simple Java program.
// FileName : "MCAE.java".
 

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // sum list using recursion 
    public static int sumList(List<Integer> lst) { 
        if (lst.isEmpty()) {
            return 0;
        } else {
            return lst.get(0) + sumList(lst.subList(1, lst.size()));
        }
        } // sumList 
    // sum list using iterative 
    public static int sumList2(List<Integer> lst) {
        int total = 0; 
        for (Integer i : lst)
            total += i;
        return total;
} // sumList2
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        int result = sumList(lst);
        System.out.println("Sum of the list: " + result);
        result = sumList2(lst);
        System.out.println("Sum of the list: " + result);
    } // main functions 
} // public class Main 




 