package SearchingAndSorting;

import java.util.Arrays;
// Merge Without Extra Space 
public class Program14 {
    public static void merge(int arr1[], int arr2[], int n, int m) {

        int i = n-1;
        int j = 0;

        while(i >= 0 && j < m){

            if(arr1[i] > arr2[j]){
                
                int temp = arr2[j];
                arr2[j] = arr1[i];
                arr1[i] = temp;
            }
            i--;
            j++;

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        
        int arr1[] = {1, 1, 2, 2, 2, 2, 4, 4, 5, 5, 7, 8, 10, 11, 11, 12, 14, 15, 17, 18, 19, 19, 20};
        int arr2[] = {1, 2, 2, 3, 3, 4, 5, 5, 7, 7, 8, 8, 8, 9, 9, 10, 13, 13, 14, 15, 16, 17, 18, 18, 18, 19, 19};

        int N = arr1.length, M = arr2.length;

        merge(arr1, arr2, N, M);
    }
}
