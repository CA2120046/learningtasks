import javax.swing.*;

public class Inheritance {

    public static int computeValue(String value1, String value2){
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        int sum = val1 + val2;
        return sum;
    }
    public static void displayMessage(String message){
        JOptionPane.showMessageDialog( null, message, "Total" , JOptionPane.INFORMATION_MESSAGE );
    }
}

