package String;
// Check whether a String is Palindrome or not
public class Program2 {
    public static void main(String[] args){
        String name = "maaaaam";

        int left = 0; 
        int right = name.length()-1;
        int flag = 0;
        while(left < right){
            if(name.charAt(left) == name.charAt(right)){
                left++;
                right--;
            }
            else{
                flag = 1;
                System.out.println("String is not a Palindrome");
                break;
            }
        }
        if(flag == 0)
        System.out.println("String is a Palindrome");
    }
}
