package SearchingAndSorting;
// Searching in an array where adjacent differ by at most k

public class Program9 {
    static int adjacentDiffer(int[] arr, int x, int k) {    
    
        int i = 0;
        while( i < arr.length){
            
            if(arr[i] == x)
            return i;

            //Jumping to the next value with difference of K
            i = i + Math.max(1, Math.abs(arr[i] - x) / k);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {20, 40, 50, 70, 70, 60};
        int k = 20;
        int x = 60;
        
        System.out.println(adjacentDiffer(arr, x, k));
    }
}
