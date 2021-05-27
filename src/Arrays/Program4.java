package Arrays;

import java.util.Arrays;
// Given an array which consists of only 0, 1 and 2. 
// Sort the array without using any sorting algo
public class Program4 {
    public static void main(String args[])
    {
        int a[] = {1, 2, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2};
        System.out.println(Arrays.toString(a));

        int low = 0; 
        int mid = 0;
        int high = a.length-1;

        while(mid<=high) 
        {
            if(a[mid] == 0)
            {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else if(a[mid] == 2)
            {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
            System.out.println(Arrays.toString(a));
    }
}
