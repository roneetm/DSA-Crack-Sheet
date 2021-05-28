package SearchingAndSorting;
// Value equal to index value
public class Program2 {
    public static void indexValue(int[] a){

        for(int i = 0; i < a.length; i++){
            if(a[i] == i){
                System.out.println("Element Found " + a[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, -1, 0, 3, 4, 11, 30, 50, 100};
        indexValue(arr);
    }
}   