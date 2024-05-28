import java.util.HashSet;
public class problem4 {
    public static boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            if(!set.add(num))
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args [])
    {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
