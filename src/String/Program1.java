package String;
// Programt to Reverse a String
public class Program1 {
    public static void main(String argsp[]){
        String email = "leahciM teenoR";

		char[] a = email.toCharArray();
		

		for(int i = a.length-1; i >=0; i--){
			System.out.print(a[i]);
		}
    }
}

/*

Alternate Method

String email = "Roneet Michael";

		char[] a = email.toCharArray();
		
		int left = 0, right = a.length-1;

		while(left <= right){
			char temp = a[left];
			a[left] = a[right]; 
			a[right] = temp;
			left++;
			right --;
			
		}
        for (char c : a)
		System.out.print(c);


*/ 