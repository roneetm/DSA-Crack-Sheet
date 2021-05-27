package Arrays;
public class Program33 {
    public static void main(String args[]){
        int a[] = {2, 1, 5, 6, 3};
        int k = 3;
        int n = a.length;
        int good = 0;
        int bad = 0;
        int swap = Integer.MAX_VALUE;
       
        for(int i = 0; i < i+k; i++){
            if(a[i] <= k){
                good++;
            }
        }

        for(int i = 0; i < good; i++){
            if(a[i] > k)
            bad++;
        }
        
        System.out.println(swap);
    }
}
