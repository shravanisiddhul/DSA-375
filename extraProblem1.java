public class extraProblem1 {
    public static boolean sort(int nums[], int target)
    {
        int low = 0;
        int high = nums.length-1;

        while(low <= high)
        {
            int mid = (low + high)/2;
            if(target == nums[mid])
            {
                return true;
            }
            if(nums[mid] >= nums[low])
            {
                if(target <= nums[mid] && target > nums[low])
                {
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else if(nums[mid] <= nums[high])
            {
                if(target >= nums[mid] && target < nums[high])
                {
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                high--;
            }
        }
        return false;
    }
    public static void main(String args [])
    {
        int nums[] = {2,5,6,0,0,1,2};
        System.out.println(sort(nums, 3));
    }
}
