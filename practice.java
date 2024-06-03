import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice
{
    public static int[][] overlappedInterval(int [][] Intervals)
    {
        if(Intervals == null || Intervals.length == 0)
        {
            return new int [0][0];
        }

        Arrays.sort(Intervals,(a,b) -> Integer.compare(a[0],b[0]));

        List<int []> mergedIntervals = new ArrayList<>();
        int [] currInterval = Intervals[0];
        mergedIntervals.add(currInterval);

        for(int[] interval : Intervals)
        {
            int currEnd = currInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(currEnd >= nextStart)
            {
                currInterval[1] = Math.max(currEnd, nextEnd);
            }else{
                currInterval = interval;
                mergedIntervals.add(currInterval);
            }
        }
        return mergedIntervals.toArray(new int [mergedIntervals.size()][]);
    }

    public static void main(String args [])
    {
        int[][] Intervals = {{1,3},{2,4},{6,8},{9,10}};

        int [][] result = overlappedInterval(Intervals);
        System.out.println(Arrays.deepToString(result));
    }
}