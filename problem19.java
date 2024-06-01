import java.util.Arrays;

public class problem19 {
    public static int kthSmallest(int [] nums,int k)
    {
        Arrays.sort(nums);
        return nums[k - 1];
    }
    public static void main(String args [])
    {
        int nums[] = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = kthSmallest(nums, k);
        System.out.println(result);
    }
}
