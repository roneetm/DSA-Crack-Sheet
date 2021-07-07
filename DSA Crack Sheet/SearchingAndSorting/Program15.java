package SearchingAndSorting;
// Zero Sum Subarrays 
import java.util.HashMap;

// print all subarrays with 0 sum
public class Program15 {
    private static int subArrays(int[] arr, int n) {

    HashMap<Integer, Integer> hmap = new HashMap<>();
    
    int sum = 0, count=0;
    
    hmap.put(0, 1);
       
    for(int i = 0; i < arr.length; i++){
        
        sum = sum + arr[i];
        
        if(hmap.containsKey(sum)){
            count+= hmap.get(sum);
        }
        hmap.put(sum, hmap.getOrDefault(sum, 0)+1);
    }
      return count;
    }
    public static void main(String[] args) {
        int arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7};
        int n = arr.length;

        System.out.println(subArrays(arr, n));

    }
}