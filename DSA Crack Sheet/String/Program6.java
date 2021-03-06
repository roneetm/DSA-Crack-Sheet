package String;
// Write a Program to check whether a string is a valid shuffle of two strings or not	
public class Program6 {
    public static boolean isValid(String s1, String s2, String res){
		int flag = 0;
			

		if(res.length() != s1.length() + s2.length())
		return false;
		
		else{

			int i = 0; int j = 0; int k = 0;
			while( i < s1.length() && j < s2.length()){
				if(s1.charAt(i) == res.charAt(k)){
					i++;
					k++;
				}
				else if(s2.charAt(j) == res.charAt(k)){
					j++;
					k++;
				}
				else{
					flag = 1;
					break;
				}
			}
		}
        return flag == 0;
	}
  public static void main(String[] args){
	
	String s1 = "xy";
	String s2 = "12";
	String res = "x1y2";
	System.out.println("Is Valid Shuffle : " + isValid(s1, s2, res));
	}
}
