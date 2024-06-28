import java.util.*;
class practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        System.out.println("Enter an Array : ");
        int A[] = new int[size];

        for(int i=0;i<A.length;i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println(" Reverse Array is : ");
        for(int i = A.length-1;i>=0;i--)
        {
            System.out.print(A[i]+" ");
        }
    }
}