package Arrays;
// Count Inversion
public class Program16 {
    public static void main(String args[])
    {
        int arr[] = {2, 4, 1, 3, 5};
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        System.out.println("Total Count = "+ count);
    }
}
