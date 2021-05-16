package Matrix;

import java.util.HashMap;
import java.util.Map;

public class Program10 {
    public static void main(String args[]){
        int a[][] = {{1, 2, 1, 4, 8},
                    {3, 7, 8, 5, 1},
                    {8, 7, 7, 3, 1},
                    {8, 1, 2, 7, 9},
                    };
        
        int n = a.length;
        int m = a[0].length;

        Map<Integer, Integer> hs= new HashMap<>();

        for(int i = 0; i < n; i++){
            hs.put(a[0][i], 1);
        }

        for(int i = 1; i < n; i++){
            for( int j = 0; j < m; j++){
                if(hs.get(a[i][j]) != null && hs.get(a[i][j]) == i){

                    hs.put(a[i][j], i+1);
                }
                
                if(i == n-1){
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}