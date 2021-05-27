package Arrays;
public class Program23 {
    public static void main(String args[]){

        int a[] = new int[]{6, -3, -10, 0, 2};

        int max_end = a[0];
        int min_end = a[0];
        int overall = a[0];


        for(int i = 1; i<a.length; i++){
            int temp = max_end;
            max_end = Math.max(a[i], Math.max(a[i]*max_end, a[i]*min_end));
            min_end = Math.min(a[i], Math.min(a[i]*temp, a[i]*min_end));
            overall = Math.max(overall, max_end);
        }
        System.out.println(overall);
    }
}