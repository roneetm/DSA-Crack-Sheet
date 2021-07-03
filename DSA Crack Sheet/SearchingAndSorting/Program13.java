package SearchingAndSorting;
//Count triplet with sum smaller than a given value
import java.util.Arrays;

public class Program13 {
    public static long countTriplets(long a[], int n, int sum)
    {
        Arrays.sort(a);
        long count = 0;
        for(int i = 0; i < n-2; i++){

            int j = i+1;
            int k = n-1;
            while( j < k ){
                
                if( a[i] + a[j] + a[k] >= sum ){
                    k--;
                }
                else{
                    count += (k - j);
                    j++;
                }    
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int n = 5, x = 12;
        long arr[] = {5, 1, 3, 4, 7};
        System.out.println(countTriplets(arr, n, x));
    }
}
