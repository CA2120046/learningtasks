public class List{

    private String products[][] = {{"1 Special Meal", "2 pcs Burgersteak", "8 pcs Bucket Chicken", "Burgersteak"},{"Sprite", "Coca Cola", "Pineapple Juice", "Coca Cola Zero"},{"Sundae","Coke Float"}};
    int productNo[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10}};
    double price[][] = {{150.10, 200.00, 320.20, 100.00}, {20.00, 30.00, 25.00, 40.00}, {60.50, 90.90}};


    public void DisplayMenu(){

        System.out.println("\t\t\t\tMENU:");
        System.out.println("Item number" + "\t\t" + "Name" + "\t\t\t" + "Item Price");
        System.out.println("1" + "\t\t" + "1 Special Meal" + "\t\t\t" + "Php150.10");
        System.out.println("2" + "\t\t" + "2 pcs Burger Steak" + "\t\t\t" + "Php200.00");
        System.out.println("3" + "\t\t" + "8 pcs Bucket Chicken" + "\t\t\t" + "Php320.20");
        System.out.println("4" + "\t\t" + "Burger Steak " + "\t\t\t" + "Php100.00");
        System.out.println("5" + "\t\t" + "Sprite" + "\t\t\t" + "Php20.00");
        System.out.println("6" + "\t\t" + "Coca Cola" + "\t\t\t" + "Php30.00");
        System.out.println("7" + "\t\t" + "Pineapple Juice" + "\t\t\t" + "Php25.00");
        System.out.println("8" + "\t\t" + "Coca Cola Zero" + "\t\t\t" + "Php40.00");
        System.out.println("9" + "\t\t" + "Sundae" + "\t\t\t" + "Php60.50");
        System.out.println("10" + "\t\t" + "Coke Float" + "\t\t\t" + "Php90.90");
    }
}