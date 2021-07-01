package SearchingAndSorting;
// find a pair with a given difference
import java.util.Arrays;

public class Program10 {
    public static int findPair(int arr[], int size, int n)
    {

        Arrays.sort(arr);

        for(int i = 0; i < size-1; i++){

            int ans = arr[i] + n;

            int result = binarySearch(arr, i, size-1, ans);
            if(result == ans)
            return 1;
        }

        return -1;
    }

    private static int binarySearch(int[] arr, int i, int j, int ans) {

        int low = i;
        int high = j;

        while( low <= high){
            int mid = ( low + high ) / 2;

            if(arr[mid] == ans){
                return arr[mid];
            }

            if( arr[mid] < ans ){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 5, 80};
        //5, 20, 3, 2, 5, 80 
        //2, 3, 5, 5, 20, 80 

        int N = 78;
        int L = 6;

        System.out.println(findPair(arr, L, N));
    }
}