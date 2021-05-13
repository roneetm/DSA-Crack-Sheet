package Arrays;
public class Program21 {
    public static void main(String args[]){
        int a[] = new int[] {4, 2, -3, 1, 6};
        int key = 0;
        int sum;
        for(int i = 0; i<a.length-1; i++){
            sum = a[i];
            for(int j = i+1; j<a.length-1; j++){
                if(sum == key)
                System.err.println("Element Found");
                else
                sum = sum + a[j];
            }
        }
    }
}