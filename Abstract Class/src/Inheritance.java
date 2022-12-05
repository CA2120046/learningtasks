import javax.swing.*;
public class Inheritance {
    public static int solveValue(
            String given1, String given2
    ) {
        int giv1 = Integer.parseInt(given1);
        int giv2 = Integer.parseInt(given2);
        int product = giv1 * giv2 + giv2 - giv1;
        return product;
    }
    public static void displayMessage(String message){
        JOptionPane.showMessageDialog( null, message, "Number" , JOptionPane.INFORMATION_MESSAGE );
    }

}
