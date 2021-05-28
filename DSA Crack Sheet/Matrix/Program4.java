package Matrix;
// Row with max 1s 
public class Program4 {
    public static void main(String[] args){

        int[][] a = {{0, 0, 1, 1},
        {1, 1, 1, 1},
        {0, 1, 1, 1},
        {0, 0, 0, 0}};

        int n = a.length; 
        int m = a[0].length;

        int i = 0; int j = m-1;
        int row = -1;
        while(i < n && j >= 0){
            if(a[i][j] == 1){
                j--;
                row = i;	
            }
            else{
                i++;
            }
        }
        System.out.println("Rows with Maximum 1's " + row);	
    }
}