public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */

    public static void main(String[] args) {
        // declare and initialize variables
        double price = 9.99;
        int quantity = 6;
        double _tax = 7;
        final double Tax=_tax/100.0;

                //calculations
        double subtotal= price*quantity;
        double taxTotal=subtotal*Tax;
        double totalCost= subtotal+taxTotal;
        System.out.println("you bought "+quantity+" shirts for "+price+" per shirt ");
        System.out.println("subtotal "+subtotal);
        System.out.println("tax "+taxTotal);
        System.out.println("total "+totalCost);

        //discounts and whatnot

        //formula: ammount*(1+/- percentage)=total

    }


}
