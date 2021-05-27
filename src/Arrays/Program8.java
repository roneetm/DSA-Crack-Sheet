package Arrays;

// find Largest sum contiguous Subarray
public class Program8 {
    public static void main(String args[])
    {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max = 0;
        int sum = 0;

        for(int i = 0; i < a.length; i++)
        {
            max = max + a[i];
            if(max < 0)
            {  
               max = 0; 
            }
            if(sum < max)
            {
                sum = max; // 4 
            }
        }
        System.out.println(sum);
    }   
}