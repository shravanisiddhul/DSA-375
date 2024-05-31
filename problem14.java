public class problem14 {

    // 	Find Minimum in Rotated Sorted Array
    public static int findMin(int[] nums)
    {
        int left = 0;
        int right = nums.length - 1;

        if(nums[left] < nums[right])
        {
            return nums[left];
        }

        while(left < right)
        {
            int mid = (left + right) / 2;
            if(nums[right] < nums[mid])
            {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String args [])
    {
        int [] nums = {3, 4, 5, 6, 1, 2};

        System.out.println(findMin(nums));
    }
}
