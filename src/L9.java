import javax.swing.JOptionPane;

public class L9{

    public static void main(String[] args) {


        String firstname = JOptionPane.showInputDialog("What is your name?");
        String lastname = JOptionPane.showInputDialog("What last name is?");



        JOptionPane.showMessageDialog(null, "Howdy " + firstname + "+" + lastname+ "!!");




      System.exit(0);

    //ALL INPUT IS RECEIVED AS A STRING
        // PRO TIP: Variables of same data type can be separated with a comma in declaration








    }




}
