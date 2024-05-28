import java.util.Scanner;
public class problem2 {
    // reverse the array
    public static void main(String args [])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int n[] = new int[size];

        System.out.println("Enter Elements in an Array : ");
        for(int i=0;i<n.length;i++)
        {
            n[i] = sc.nextInt();
        }

        System.out.println("Reversed Array is : ");
        for(int i=n.length-1;i>=0;i--)
        {
            System.out.print(n[i]+" ");
        }
    }
}
