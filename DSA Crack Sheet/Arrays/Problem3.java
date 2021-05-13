package Arrays;
import java.util.Arrays;
import java.util.Scanner;

// Find the "Kth" max and min element of an array 

public class Problem3 {
   public static int kthMin(int[] arr, int kth)
   {
        Arrays.sort(arr); // Implementing Inbuilt Sort 
        System.out.println(Arrays.toString(arr));
        return arr[kth-1];
   }
   public static int kthMax(int[] arr, int kth) 
   {
        int temp;
        for(int i = 0; i<arr.length; i++) // Implementing Bubble Sort Algorihtm
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[kth-1];
   }

   public static void main(String args[])
   {
        int array[] = {7, 10, 4, 3, 20, 15};
        System.out.print("Enter Kth Element ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(kthMin(array, k)); // Calling Min Function
        System.out.println(kthMax(array, k)); // Calling Max Function
        sc.close();
   }
}