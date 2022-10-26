import java.util.Scanner;

public class Order extends List{
    int order;
    double quantity[] = new double[9999];
    double total;
    String choice;
    double payment;
    double change;
    Scanner sc = new Scanner(System.in);

    public void Intro(){
        System.out.print("\nWould you like to order ? Y/N: ");
        choice = sc.next();

        if (choice.equalsIgnoreCase("Y")){
            DisplayMenu();
            DisplayOrder();
            Decision();
        }
        else if(!choice.equalsIgnoreCase("N")){
            System.out.println("I'm sorry please try again.");
            Decision();
        }

    }
    public void DisplayOrder(){

        System.out.print("\nPlease Enter your order: ");
        order = sc.nextInt();

        if (order == productNo[0][0]) {
            System.out.print("Quantity: ");
            quantity[0] = sc.nextInt();
            total = total +(price[0][0] * quantity[0]);
        }

        else if (order == productNo[0][1]) {
            System.out.print("Quantity: ");
            quantity[1] = sc.nextInt();
            total = total +(price[0][1] * quantity[1]);
        }

        else if (order == productNo[0][2]) {
            System.out.print("Quantity: ");
            quantity[2] = sc.nextInt();
            total = total +(price[0][2] * quantity[2]);
        }

        else if (order == productNo[0][3]) {
            System.out.print("Quantity: ");
            quantity[3] = sc.nextInt();
            total = total +(price[0][3] * quantity[3]);
        }

        else if (order == productNo[1][0]) {
            System.out.print("Quantity: ");
            quantity[4] = sc.nextInt();
            total = total +(price[1][0] * quantity[4]);
        }

        else if (order == productNo[1][1]) {
            System.out.print("Quantity: ");
            quantity[5] = sc.nextInt();
            total = total +(price[1][1] * quantity[5]);
        }

        else if (order == productNo[1][2]) {
            System.out.print("Quantity: ");
            quantity[6] = sc.nextInt();
            total = total +(price[1][2] * quantity[6]);
        }

        else if (order == productNo[1][3]) {
            System.out.print("Quantity: ");
            quantity[7] = sc.nextInt();
            total = total +(price[1][3] * quantity[7]);
        }
        else if (order == productNo[2][0]) {
            System.out.print("Quantity: ");
            quantity[8] = sc.nextInt();
            total = total +(price[2][0] * quantity[8]);
        }
        else if (order == productNo[2][1]) {
            System.out.print("Quantity: ");
            quantity[9] = sc.nextInt();
            total = total +(price[2][1] * quantity[9]);
        }
        else if (order == productNo[2][2]) {
            System.out.print("Quantity: ");
            quantity[10] = sc.nextInt();
            total = total +(price[2][2] * quantity[10]);
        }
        else {
            System.out.println(" Item is unknown");
            DisplayOrder();
        }
    }

    public void Decision(){
        System.out.print("\nWould you like to order another food? Y/N: ");
        choice = sc.next();

        if (choice.equalsIgnoreCase("Y")){
            DisplayMenu();
            DisplayOrder();
            Decision();
        }
        else if(!choice.equalsIgnoreCase("N")){
            System.out.println("I'm sorry please try again.");
            Decision();
        }
    }

    public void DisplayPayment(){
        System.out.println("\nTotal Price: PHP" + total);
        System.out.print("Please enter your payment(Press 0 to CANCEL payment): ");
        payment = sc.nextInt();

        if (payment < total && payment > 0){
            System.out.println("Not enough payment!");
            DisplayPayment();
        }
        else if (payment == 0){
            System.out.println("Payment has been successfuly canceled");
            System.exit(0);
        }
        else{
            change = payment - total;
            System.out.println("\nYour total change would be: PHP" + change);
            System.out.println("Thank you for ordering!");
        }
    }
}

