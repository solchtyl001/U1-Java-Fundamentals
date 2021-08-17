public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */
    public static void main(String[] args) {


        double testScore1 = 69.69;
        double testScore2 = 69.69;
        double testScore3 = 69.69;
        double testScore4 = 69.69;

        double sumTotal=testScore1+testScore2+testScore3+testScore4;
        double average = sumTotal/4.0;
        System.out.println("The average is "+ average+". Nice");
    }

}
