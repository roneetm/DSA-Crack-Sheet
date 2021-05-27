package String;

public class Program12 {
    public static int maxSubStr(String str, int n){

		int zero = 0;
		int one = 0;
		int count = 0;

		for (int i = 0; i < n; i++){
			if(str.charAt(i) == '0'){
				zero++;
			}
			else{
				one++;
			}
			if(one == zero){
				count++;
			}
		}
		
		if(zero != one)
			{	
				return -1;
			}
		return count;
	}
    public static void main(String[] args) {
        
        String str = "0111100010";
        int n = str.length();
        
        String str1 = "0100110101";
        int m = str.length();
  
        System.out.println(maxSubStr(str, n));
        System.out.println(maxSubStr(str1, m));

    }
}
