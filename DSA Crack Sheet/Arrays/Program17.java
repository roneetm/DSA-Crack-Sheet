package Arrays;

public class Program17 {
    public static void main(String args[])
    {
        int prices[] = {7,1,5,3,6,4};
        int day = 1;
        int buy = prices[day];
        int sell = prices[day+1];
        int max = 0;
        for( int i = day; i < prices.length; i++)
        {
            int diff = sell - buy;
            if(diff > max)
            max = diff;
            day++;
        }
        System.out.println(max);
    }
}