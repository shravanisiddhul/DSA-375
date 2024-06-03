import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice
{
    public static List<List<Integer>>threeSum(int [] nums)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++)
        {
            if(i != 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            if(nums[i] > 0)
            {
                break;
            }

            int j = i+1;
            int k = n-1;

            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum > 0)
                {
                    k--;
                }else if(sum< 0)
                {
                    j++;
                }else{
                    List<Integer> temp =  Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);

                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1])
                    {
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
            }
            
        }
        return ans;
    }
    public static void main(String args [])
    {
        int nums[] = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
}