package Arrays;

// Find factorial of a large number
public class Program22 {
    public static void main(String args[])
    {
        int n = 50;
        int[] res = new int[500];
        res[0] = 1;
        int size = 1;
        int prod;
        for(int x = 2; x <=n; x++)
        {
            int carry = 0;
            for(int i =0; i<size; i++)
            {
                prod = res[i] * x + carry;
                res[i] = prod % 10;
                carry = prod / 10;
            }
            while(carry > 0)
            {
                res[size++] = carry % 10;
                carry = carry / 10;
            }
        }
        System.out.println();
        for(int i = size-1; i >=0; i--)
        System.out.print(res[i]);
        System.out.println();
    }
}