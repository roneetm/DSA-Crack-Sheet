package SearchingAndSorting;

public class Program1 {
    public static void findFirstAndLast(int[] arr, int x) {

        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }

        if (first != -1) {
            System.out.println("First Element : " + first + " \nLast Element : " + last);
        } else {
            System.out.println("Element not found");
        }
    }
        public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x = 8;
        findFirstAndLast(arr, x);
    }
}