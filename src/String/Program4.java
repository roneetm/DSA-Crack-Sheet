package String;
// Print all the duplicates in the input string //

import java.util.HashMap;
import java.util.Map;

public class Program4 {
    public static void main(String[] args){
		String email = "geeks for geeks";
		char[] ch = email.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<>();

		for(int i = 0; i < email.length(); i++){
			if(charMap.containsKey(ch[i])){
				charMap.put(ch[i],  charMap.get(ch[i]) + 1);
			}
			else{
				charMap.put(ch[i], 1);
			}
		}

		for (Map.Entry mapElement : charMap.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println(key
                                   + ", charMap = " + value);
        }
    }
}