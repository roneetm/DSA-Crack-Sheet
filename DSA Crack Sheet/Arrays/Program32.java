package Arrays;
import java.util.Arrays;

public class Program32 {
    public static void main(String[] args){
        int[] a = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        int lowVal = 14, highVal = 20;
        int n = a.length;

        int start = 0; int end = n-1;

        System.out.println(Arrays.toString(a));   

        for(int i = 0; i <=end;){
            if(a[i] < lowVal){
                int temp = a[start];
                a[start] = a[i];
                a[i] = temp;

                i++;
                start++;
            }

            else if(a[i] > highVal){
                int temp = a[end];
                a[end] = a[i];
                a[i] = temp;
                end--;
            }
            else
            i++;
        }
        System.out.println(Arrays.toString(a));   
    }
}