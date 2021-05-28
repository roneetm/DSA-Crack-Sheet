package Arrays;
public class Program34 {
    public static void main(String[] args){
        int[] a = {15, 4, 15};
        int n = a.length;
        int swap = 0;
        int i = 0; int j = n-1;

        while(i <= j){
            if(a[i] == a[j]){
                i++;
                j--;
            }
            else if(a[i] < a[j]){
                i++;
                a[i] = a[i] + a[i-1];
                swap++;
            }
            else{
                j--;
                a[j] = a[j] + a[j-1];
                swap++;
            }
        }
        System.out.println(swap);
    }
}
