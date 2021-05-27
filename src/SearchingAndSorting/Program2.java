package SearchingAndSorting;
// Value equal to index value
public class Program2 {
    public static void indexValue(int a[]){

        for(int i = 0; i < a.length; i++){
            if(a[i] == i){
                System.out.println("Element Found " + a[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        indexValue(arr);
    }
}