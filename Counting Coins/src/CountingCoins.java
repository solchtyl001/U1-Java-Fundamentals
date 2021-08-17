public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   $0.51 -> 2 quarters and 1 penny.
     */
    public static void main(String[] args) {
        double rawChange = 585667845;

         int  change = (int) (rawChange * 100);

         int numQuarters = change / 25;
         change = change % 25;
         int numDimes = change / 10;
         change = change % 10;
         int numNickles= change / 5;
         int numPennies= change %5;
         System.out.println("the number coins to get $"+ rawChange);
        System.out.println("quaters: "+numQuarters);
        System.out.println("dimes"+numDimes);
        System.out.println("nickles"+numNickles);
        System.out.println("pennies"+numPennies);





    }








}
