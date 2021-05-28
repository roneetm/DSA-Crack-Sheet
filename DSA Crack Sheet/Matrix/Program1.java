package Matrix;
// Spiral traversal on a Matrix
public class Program1 {

	public static void main(String[] args) {
	
		int[][] a = {   { 1, 2, 3, 4 },
                                { 5, 6, 7, 8 },
                                { 9, 10, 11, 12 },
                                { 13, 14, 15, 16 } };
		int n = 4;
		int left = 0;
		int right = n-1;
		int top = 0;
		int bottom = n-1;
		int i;
		int direction = 0;

		while(top <= bottom && left <=right){
		if(direction == 0){
			for(i = left; i <=right; i++)
				System.out.print(a[top][i] + " ");
				top++;
			}
		else if(direction == 1){
			for(i = top; i <= bottom; i++)
				System.out.print(a[i][right] + " ");
				right--;
			}

		else if( direction == 2){
			for(i = right; i >= left; i--)
			System.out.print(a[bottom][i] + " ");
			bottom--;
		}
		else if(direction == 3){
			for(i = bottom; i >= top; i--)
			System.out.print(a[i][left] + " ");
			left++;
		}
		if(direction == 3)
		direction = 0;
		else
		direction++;
		
                }		
        }      
}