public class Teacher extends Subject {
    //fields of parent class
    private String designation;
    String subjectName;
    String strAction;
    Subject subObj = new Subject();

    College col = new College();

    public Teacher(String designation, String collegeName, String subjectName) {
        super();

        this.designation = designation;
        col.setCollege(collegeName);
        subObj.setSubject(subjectName);
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getDesignation()
    {
        return designation;
    }
    public String getSubjectName()
    {
        return subObj.subject;
    }

    public String getCollegeName()
    {
        return col.College;
    }

    //method of parent class
    void does(){
        System.out.println("College");
    }
    //overloading
    private void does(String strAction){
        this.strAction = strAction;
        System.out.println("Teaching - " + strAction);
    }
}

