package Arrays;
import java.util.Arrays;

public class Program28 {

    public static boolean triplet(int[] a, int sum){
        int i = 0;
        
        for(i = 0; i < a.length; i++){
            int l = i+1;
            int r = a.length-1;
            while(l<r){
                if (a[i] + a[l] + a[r] == sum)
                return true;

                else if (a[i] + a[l] + a[r] < sum){
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){

        int[] a = new int[]{12, 3, 4, 1, 6, 9};
        Arrays.sort(a);
        int sum = 20;
        System.out.println(triplet(a, sum));
    }
}
