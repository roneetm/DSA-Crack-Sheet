package String;
// Count and Say problem
public class Program7 {
    public static String countAndSay(int n){

        if(n == 1) return "1";
        if(n== 2) return "11";
        
        String sb = "11";	
        
        for(int i = 3; i <=n; i++){
            String temp = "";
            int count = 1;
            sb += "$";
            for(int j = 1; j < sb.length(); j++){

                if(sb.charAt(j) != sb.charAt(j-1)){
                    temp = temp + count; 
                    temp = temp + sb.charAt(j-1);
                    count = 1;
                }					
                else 
                count++;
            }
            sb = temp;
        }
        
        return sb;
    }

    public static void main(String[] args) {

        int n =  4;
    	System.out.println(countAndSay(n));
    }
}
