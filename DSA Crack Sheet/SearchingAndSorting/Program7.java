package SearchingAndSorting;

import java.util.Arrays;

// Find the repeating and the missing
public class Program7 {
    public static void main(String[] args) {
        int a[] = { 7, 3, 4, 5, 5, 6, 2 };

        Arrays.sort(a);
        int repeat = 0;
        for(int i = 1; i < a.length; i++){

            if(a[i]==a[i-1]){
                repeat = a[i];
            }
        }

        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }

        int total = 0;
        for(int i = 1; i <=a.length; i++){
            total = total + i;
        }

        int missing = total - (sum - repeat);
        
        System.out.println("Repeated Element : "+ repeat + "\nMissing Element : "+ missing);
    }
}