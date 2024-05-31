import java.util.Arrays;

public class problem15 {

    // Find Pair with Sum in Sorted & Rotated Array
    public static int countPair(int a[],int sum,int n)
    {
        int i = 0;
        int j = n - 1;
        int k = 0;
        int ans = 0;

        while(i < j)
        {
            k = a[i] + a[j];
            if(k == sum)
            {
                ans++;
                i++;
                j--;
            }else if(sum > k)
            {
                i++;
            }else{
                j--;
            }
        }
        if(ans == 0)
        {
            return -1;
        }
        return ans;
    }

    public static void main(String args [])
    {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.sort(a);
        int sum = 10;
        int result = countPair(a, sum, a.length);

        if(result == -1)
        {
            System.out.println("no pair is found");
        }else{
            System.out.println("Number of pairs are : "+result);
        }
        
        
    }
}
