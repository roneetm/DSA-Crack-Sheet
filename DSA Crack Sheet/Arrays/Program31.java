package Arrays;
public class Program31 {
    public static int smallsubset(int a[], int n, int x){
        int min = n+1;

        for(int i = 0; i<n; i++){
            int sum = a[i];
            if(sum > x)
            return 1;
            for(int j = i+1; j< n; j++){
                    sum+=a[j];

                    if(sum > x && (j - i) + 1 < min){
                        min = (j - i) + 1;
                    }
                }
            }
        return min;
    }

    public static void main(String args[]){
        int a[] = new int[] {1, 2, 4};
        int x = 8;
        int n = a.length;
        System.out.println(smallsubset(a, n, x));
    }
}