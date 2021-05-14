package Matrix;
// Row with max 1s 
public class Program4 {
    public static int MaxRows(int a[][], int n, int m){
        
        for(int col = 0; col < m; col++){
            for(int row = 0; row < n; row++){
                if(a[row][col] == 1){
                    return row;
                }
            }
        }
       return -1;
    }
    public static void main(String args[]){

        int a[][] = {{0, 0, 1, 1},
                    {0, 1, 1, 1},
                    {1, 1, 1, 1},
                    {0, 0, 0, 0}};

        int n = a.length;
        int m = a[0].length;
        System.out.println(MaxRows(a, n, m));
    }
}