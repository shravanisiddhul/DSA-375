import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class problem9 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long n = A.size();
        
        // Calculate the expected sum and sum of squares for the first n natural numbers
        long Sn = (n * (n + 1)) / 2;
        long S2n = (n * (n + 1) * (2 * n + 1)) / 6;
        
        long S = 0;
        long S2 = 0;
        
        // Calculate the sum and sum of squares of the given array
        for(int i = 0; i < n; i++) {
            S += A.get(i);
            S2 += (long) A.get(i) * (long) A.get(i);
        }
        
        // Calculate the differences
        long val1 = S - Sn;
        long val2 = S2 - S2n;
        
        // Using val2/val1 to get the sum of the repeated and missing number
        long val2DivVal1 = val2 / val1;
        
        // Calculating the repeated and missing numbers
        long x = (val1 + val2DivVal1) / 2;
        long y = x - val1;
        
        // Return the results as an ArrayList
        return new ArrayList<>(Arrays.asList((int) x, (int) y));
    }
    
    public static void main(String[] args) {
        problem9 solution = new problem9();
        
        // Example list
    
        List<Integer> A = Arrays.asList(3, 1, 2, 5, 3);
        
        // Finding the repeated and missing numbers
        ArrayList<Integer> result = solution.repeatedNumber(A);
        
        // Printing the result
        System.out.println("Repeated Number: " + result.get(0));
        System.out.println("Missing Number: " + result.get(1));
    }
}

