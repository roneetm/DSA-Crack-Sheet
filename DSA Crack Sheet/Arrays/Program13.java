package Arrays;
// Kadane's Algo 
public class Program13 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,-2,5};
        int end = 0;
        int far = 0;

        for(int i =0; i < arr.length; i++)
        {
            end = end + arr[i];
            {
                if(end < 0)
                end = 0;

                else if(far < end)
                {
                    far = end;
                }
            }
        }
        System.out.println(end);
    }
}
