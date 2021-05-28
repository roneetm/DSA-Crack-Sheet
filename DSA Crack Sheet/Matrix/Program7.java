package Matrix;
// Find a specific pair in matrix
public class Program7 {
    public static void main(String[] args){
        int[][] mat = {
            { 1, 2, -1, -4, -20 },
            { -8, -3, 4, 2, 1 },
            { 3, 8, 6, 1, 3 },
            { -4, -1, 1, 7, -6 },
            { 0, -4, 10, -5, 1 }
         };
    int max = Integer.MIN_VALUE;
    for(int a = 0; a < mat.length; a++){
        for(int b = 0; b < mat[0].length; b++){
            for(int c = a + 1; c < mat.length; c++){
                for(int d = b +1; d < mat[0].length; d++){
                    if(max < (mat[c][d] - mat[a][b]))
                    max = mat[c][d] - mat[a][b];
                }
            }
        }
    }
        System.out.println(max);
    }
}
