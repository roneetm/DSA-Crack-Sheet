package Arrays;
import java.util.Arrays;

public class Program30 {

    public static int findMin(int[] a, int n, int m){
        int min = Integer.MAX_VALUE;

        if(n < m)
        return -1;

        if(m == 0 || n == 0){
            return 0;
        }

        for(int i = 0; i + m-1 < n; i++){

            int diff = a[i + m-1] - a[i];
            min = Math.min(min, diff);
        }
        return min;
    }
    public static void main(String[] args){
        
        int[] a = new int[] {12, 4, 7, 9, 2, 23, 25, 41,
            30, 40, 28, 42, 30, 44, 48, 
            43, 50};
        int n = a.length;
        int m = 7;

        Arrays.sort(a);
       System.out.println(findMin(a, n, m));
    }
}