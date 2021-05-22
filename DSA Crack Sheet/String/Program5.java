package String;

public class Program5 {
    public static boolean isValid(String s1, String s2){
		String temp = s1.concat(s1);

		if(s1.length() != s2.length())
		return false;

		else{
			if(temp.contains(s2))
			return true;
		}
		return false;
	}
  public static void main(String args[]){
	
	String s1 = "abcd";
	String s2 = "cdab";

	System.out.println("String Rotation : " + isValid(s1, s2));
	}
}
