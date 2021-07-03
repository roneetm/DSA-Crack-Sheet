package SearchingAndSorting;
// maximum sum such that no 2 elements are adjacent
public class Program12 {
    public static int FindMaxSum(int arr[], int n)
    {   
        int even = 0, odd = 0;
        for(int i = 0; i < n; i++){

            if(i % 2 == 0){
                even = even + arr[i];
            }
            else
            odd = odd + arr[i];
        }
        return Math.max(even, odd);
    }
    public static void main(String[] args) {
        
        int n = 6;
        int a[] = {5,5,10,100,10,5};

        System.out.println(FindMaxSum(a, n));
    }
}
