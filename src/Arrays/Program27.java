package Arrays;
import java.util.Arrays;

public class Program27 {
    
    public static int binary(int a[], int n, int key){
        int low = 0; 
        int high = n;
        int mid = (low+high)/2;

        while(low <= high){
        if(key < a[mid]){
            high = mid-1;
            mid = (low+high) / 2;
        }

        if(key > a[mid]){
            low = mid+1;
            mid = (low+high) / 2;
        }

        if(a[mid] == key){
            return mid;
        }
    }
        return -1;
    }
    
    public static boolean subset(int arr1[], int arr2[], int n, int m){
        
        for(int i = 0; i < m; i++){
            int ans =  binary(arr1, n, arr2[i]);
            if(ans == -1)
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        
        int arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1, 13}; 

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n = arr1.length;
        int m = arr2.length;

        boolean result = subset(arr1, arr2, n, m);

        System.out.println(result);

    }
}