package Arrays;

import java.util.Arrays;

// Move all the negative elements to one side of the array 
public class Program5 {
    static void rearrange(int[] arr, int n)
    {
        int j = 0;
        int temp;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] < 0)
            {
                if(i != j)
                {   
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]  = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
		public static void main(String[] args)
	{
		int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9 };
        System.out.println(Arrays.toString(arr));
		int n = arr.length;

		rearrange(arr, n);
		printArray(arr);
	}
}
