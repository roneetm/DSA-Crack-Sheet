package SearchingAndSorting;

import java.util.Arrays;

// Merge Without Extra Space 
public class Program14 {
    public static void merge(int arr1[], int arr2[], int n, int m) {

        int i = 0;
        int j = 0;
        int k = n-1;

        while(i < n && j < m){

            if(arr1[i] < arr2[j]){
                i++;
            }
            else{

                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                k--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        int N = 4, M = 5;

        merge(arr1, arr2, N, M);

    }
}
