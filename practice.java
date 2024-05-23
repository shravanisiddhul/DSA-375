
import java.util.*;

public class practice {

    // Next Permutation
    public static int[] nextGreaterPermutation(int[] A) {
        int n = A.length; // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i+1]) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            reverse(A, 0, n-1);
            
        }else{

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

            for (int i = n - 1; i > ind; i--) {
                if (A[i] > A[ind]) {
                    swap(A,ind, i);
                    break;
                }
            }
            reverse(A, ind+1, n-1);
        }
        // Step 3: reverse the right half:
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i] + " ");
        }
        return A; 
    }
    public static void swap(int A[],int i,int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void reverse(int A[],int i,int j)
    {
        while(i < j)
        {
            swap(A, i, j);
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        int A[] = {1, 1, 5};
        nextGreaterPermutation(A);
    }

}
