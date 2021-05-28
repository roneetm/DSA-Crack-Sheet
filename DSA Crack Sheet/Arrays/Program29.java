package Arrays;
import java.util.Arrays;

public class Program29 {
    public static void main(String[] args){
        int[] a = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = a.length;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = a[0];
        for(int i = 1; i < n; i++){
            
            left[i] = Math.max(left[i-1], a[i]);
        }

        right[n-1] = a[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], a[i]);
        }

        int result = 0;

        for(int i = 0; i<n; i++){

            result += Math.min(right[i], left[i]) - a[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(a));
        System.out.println("Water Tapped " +result);
    }
}