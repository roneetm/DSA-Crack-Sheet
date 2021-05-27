package Arrays;
import java.util.Arrays;
// Find longest coinsecutive subsequence

public class Program24 {
    public static void main(String args[]){
        int a[] = new int[] {1, 9, 3, 10, 4, 20, 2};

        Arrays.sort(a);
        int p = 1;
        int max = 0;
        for(int i = 1; i<a.length-1; i++){
            
            if(a[i] == a[i-1]+1)
            p++;
            else
            p = 1;
            
            if(p > max)
            max = p;
        }
        System.out.println(max);
    }
}