package Arrays;
import java.util.Arrays;
// Merge 2 sorted arrays without using Extra space.
public class Program12 {
    public static void main(String args[])
    {
        int arr1[] = { 1, 5, 9, 10, 15, 20 };
        int arr2[] = { 2, 3, 8, 13 };
        System.out.println("\nArrays Before Sort\n");
        System.out.println("Array 1 "+Arrays.toString(arr1));
        System.out.println("Array 2 "+Arrays.toString(arr2));

        int len1 = arr1.length;
        int len2 = arr2.length;

        int i = 0, j = 0, k = len1-1;

        while(i < len1 && j < len2) // Merge Sort Logic Implementation
        {
            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else
            {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        } // Logic Ends Here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("\nArrays After Sort\n");
        System.out.println("Array 1 "+Arrays.toString(arr1));
        System.out.println("Array 2 "+Arrays.toString(arr2));
    }  
}