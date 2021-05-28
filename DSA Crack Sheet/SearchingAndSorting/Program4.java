package SearchingAndSorting;

public class Program4 {
    public static int countSquares(int n) {
        int count = 0;
        for(int i = 1; i < n; i++){
           for(int j = 1; j*j <= i; j++){
                if(j*j == i){
                    count++;
                }
           }
       }
       return count;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Total Perfect Squares Before " + n + " is : " + countSquares(n));
    }
}
