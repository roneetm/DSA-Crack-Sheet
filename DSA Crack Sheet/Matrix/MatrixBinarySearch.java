package Matrix;
// Program to Implement Binary Search in a Matrix 
public class MatrixBinarySearch {
    public static void main(String[] args){
        int[][] a = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
                    };

        int n = a.length;
        int m = a[0].length;

        int key = 7;

        int low = 0;
        int high = n*m-1; 
        int flag = 0;

        while(low <= high){
            
            int mid = (low + high) / 2;
            
            if(a[mid/m][mid%m] == key){
                flag = 1;
                System.out.println("Element Found");
                break;
            }

            else if(a[mid/4][mid%4] < key){
                low = mid+1;
            }

            else if(a[mid/4][mid%4] > key){
                high = mid - 1;                
            }
        }
        if(flag == 0)
        System.out.println("Element Not Found");
    }
}