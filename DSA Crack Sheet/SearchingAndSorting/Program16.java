package SearchingAndSorting;
//Product array Puzzle
import java.util.Arrays;

public class Program16 {
    private static long[] productArray(int[] nums, int n) {

        long right[] = new long[nums.length];
        long left[] = new long[nums.length];
        long[] ans = new long[nums.length];

         // Left Cumilavtive Array
        
        if(nums.length == 1){
        long ans1[] = {1};
        return ans1;
        }

        left[0] = nums[0];
        for(int i = 1; i < nums.length; i++){

            left[i] = left[i-1] * nums[i];
        }
        System.out.println("Left : " +Arrays.toString(left));

        // Right culative Array
       
        right[n-1] = nums[n-1];
        for(int j = n-2; j >= 0; j--){
            
            right[j] = right[j+1] * nums[j];
        }
        System.out.println("Right : " +Arrays.toString(right));

        // Prooduct Array
        ans[0] = right[1];
        ans[n-1] = left[n-2];

        for(int i = 1; i< n-1; i++){    
            ans[i] = left[i-1] * right[i+1];
        }

        System.out.println("Answer : " +Arrays.toString(ans));

        return ans;
    }

    public static void main(String[] args) {
        //int nums[] = {0, 8, 6, 2, 4, 7, 9, 3, 9, 2, 8, 3, 0, 1, 7, 8, 9, 1, 5, 4, 9, 2, 5, 7, 4, 9, 9, 4};
        int nums[] = {12, 0};
        //int nums[] = {1, 9, 7, 1, 3, 1, 2, 0, 6, 8, 7, 4, 9, 2, 4, 4};
        int n = nums.length;

        productArray(nums, n);
    }
}
