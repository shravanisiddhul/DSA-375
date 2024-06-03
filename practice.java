import java.util.Arrays;

public class practice
{
    public static String printLargest(int [] nums)
    {
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        if(arr[0].equals("0"))
        {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(String n : arr)
        {
            sb.append(n);
        }
        return sb.toString();
    }

    public static void main(String args[])
    {
        int nums[] = {3,30,34,5,9};
        System.out.println(printLargest(nums));
    }
}