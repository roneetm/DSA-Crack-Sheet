package Arrays;

import java.util.Arrays;

// Find the maximum and minimum element in an array
public class Program2 {

    public static void findMax(int arr[])
    {
        int max = arr[0];
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.println("Maximum Element in Array "+ max);
    }
    public static void findMin(int arr[])
    {
        int min = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]<min)
            min = arr[i];
        }
        System.out.println("Minimum Element in Array "+ min);
    }

    public static void main(String args[])
    {
        int array[] = {4, 5, 1, 4, 2, 9};
        System.out.println("Original Array "+Arrays.toString(array));
        findMin(array);
        findMax(array);
    }
}