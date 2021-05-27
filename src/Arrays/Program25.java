package Arrays;
import java.util.Arrays;

public 
class Program25 {
    public static void main(String args[]){
        
        int a[] = new int[]{3, 1, 2, 2, 1, 2, 3, 3};
        int n = a.length;

        int k = 4;
        k = n/k;
        int count = 0;
        Arrays.sort(a);

        for(int i = 0; i < n-1; i++){
            
            if(a[i] == a[i+1])
            count++;
            else count = 1;
        }
    }
}
