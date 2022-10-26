//OOP CLE1:MIDTERM EXAM

//Agapito, Carl Justin M.
//Kevin RB Dela Cruz

public class Main extends Order{
    public static void main(String []args){
        List list = new List();
        Order order = new Order();
        Fastfood fastfood= new Fastfood("Default Name");

        fastfood.setRName("Jollibee");
        System.out.println("\t\t\t\t\t\tWelcome to " + fastfood.getJName());
        order.Intro();
        list.DisplayMenu();
        order.DisplayOrder();
        order.Decision();
        order.DisplayPayment();
    }
}