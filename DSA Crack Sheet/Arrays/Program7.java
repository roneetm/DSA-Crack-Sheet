package Arrays;

import java.util.Arrays;
// Write a program to cyclically rotate an array by one.
public class Program7 {
    public static void main(String args[])
    {
        int a[] = {1, 2, 3, 4, 5};
        int k = 1;
        while(k<=10) // Using while loop to rotate it 10 times, can work without this loop also
        {
            int temp = a[0];
            for(int i = 0; i<a.length-1; i++)
            a[i] = a[i+1];
            a[a.length-1] = temp;
            System.out.println(Arrays.toString(a));
            k++;
        }   
    }
}