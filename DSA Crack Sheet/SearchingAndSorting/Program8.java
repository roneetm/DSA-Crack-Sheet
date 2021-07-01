package SearchingAndSorting;

import java.util.Arrays;

// Find majority element
public class Program8 {
    
    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);
        int count = 1;

        if(a.length == 1){
            return a[0];
        }

        for(int i = 1; i < a.length; i++){
            if(a[i-1] == a[i]){
                count++;
                if(count > size/2){
                    return a[i];
                }
            }
            else{
                count = 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    
        int A[] = {3,1,3,3,2};
        int N = 5;    
        System.out.println(majorityElement(A, N));
    }
}
