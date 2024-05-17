public class problem1 {
    public static int minimum(int A[],int N)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            if(A[i] < min)
            {
                min = A[i];
            }
        }
        return min;
    }

    public static int maximum(int A[],int N)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String args [])
    {
        int A[] = {-2, 1, -4, 5, 3};
        int N = 5;

        int sum = maximum(A, N) + minimum(A, N);
        System.out.println(sum);
    }
}
