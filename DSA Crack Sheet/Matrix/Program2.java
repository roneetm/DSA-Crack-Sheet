package Matrix;
// Search an element in a matriix
public class Program2 {
    public static void main(String args[]){
        int a[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int key = 19;
        int m = a.length;
        int n = a[0].length;

        System.out.println(m);
        System.out.println(n);
        
        int i = 0; int j = m;
        int flag = 0;
        while(i < n && j >= 0){
            if(a[i][j] == key){
                System.out.println("Element Found at " + i + " & " + j);
                flag = 1;
                break;
            }
            else if(a[i][j] > key){
                j--;
            }
            else {
                i++;
            }
        }
        if(flag == 0){
            System.out.println("Element Not Found");
        }
    }
}