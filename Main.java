public class Main extends Teacher{
    protected Main()
    {
        super("A","B","C");
    }

    public static void main(String[] args)
    {
        Teacher obj = new Teacher("Teacher","CET","Programming");
        //accessing the fields of parent class
        System.out.println(obj.getCollegeName()); // Retrieve as non private
        System.out.println(obj.getDesignation()); // Retrieve as private using getter
        System.out.println(obj.getSubjectName());

        obj.setDesignation("Lecturer"); // Change value as private
        System.out.println(obj.getDesignation());

        System.out.println(obj.getSubjectName()); // from sub class

        //accessing the method of parent class
        obj.does();

        // This will show an error due to private method
        // obj.does("Private");
    }
}
