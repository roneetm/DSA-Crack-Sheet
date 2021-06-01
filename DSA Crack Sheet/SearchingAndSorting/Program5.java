package SearchingAndSorting;
// Maximum and minimum of an array using minimum number of comparisons
class Pair{
    int min;
    int max;
}

public class Program5 {

    public static Pair getMinMax(int arr[]){
        Pair MinMax = new Pair();

        int n = arr.length;
        MinMax.min = Integer.MAX_VALUE;
        MinMax.max = Integer.MIN_VALUE;

        if(n == 1){
        return MinMax;
        }
            if(arr[0] < arr[1]){
                MinMax.min = arr[0];
                MinMax.max = arr[1];
            }
            else{
                MinMax.min = arr[1];
                MinMax.max = arr[0];
            }

        for(int i = 2; i < arr.length; i++){

            if(arr[i] > MinMax.max)
            MinMax.max = arr[i];

            if(arr[i] < MinMax.min){
                MinMax.min = arr[i];
            }
        }
       return MinMax;
    }
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        Pair result = getMinMax(arr);
        System.out.println("Min Element " + result.min + " Max Element " + result.max);
    }
}