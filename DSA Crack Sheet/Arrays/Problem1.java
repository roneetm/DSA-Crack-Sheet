package Arrays;

// Reverse the array

public class Problem1 {

    public static void printarray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+"  ");
        System.out.println("\n");
    }
    public static void reversearray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        int temp;

        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println();
        System.out.print("Array Before Reverse\t");
        printarray(array);   // Function to print the Array
        reversearray(array); // Function to Reverse the Array
        System.out.print("Array After Reverse\t");
        printarray(array);    
    }
}