package Arrays;
import java.util.Arrays;
// find duplicate in an array of N+1 Integers
public class Program11 {
    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println("Array "+ Arrays.toString(arr));

        // LOGIC BEGINS
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                System.out.println("Duplicate Element "+arr[i]);
            }
        }
    }
}
