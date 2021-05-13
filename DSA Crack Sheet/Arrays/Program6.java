package Arrays;

// Find the Union and Intersection of the two sorted arrays.
public class Program6 {
    public static void main(String args[])
    {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {4, 5, 6, 7, 8, 9};
        int i = 0, j = 0;
        while(i < a.length-1 && j < b.length-1)
        {
            if(a[i] < b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            if(b[i] < a[j])
            {
                System.out.print(a[j]+" ");
                j++;
            }
            if(a[i] == a[j])
            {
                System.out.print(a[i]);
                i++;
                j++;
            }
        }
    }
}