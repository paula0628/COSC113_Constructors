public class Students
{
    //3 attributes
    String FN;
    String LN;
    int Sid;

    //Constructors don't have any return types and no argument, but they must have the same name as the class name and
    // useful for initialization
    Students()
    {
        FN="Tabitha";
        LN="Thomas";
        Sid=100413877;

        FN="Andy";
        LN="Thomas";
        Sid=100538203;
    }
    Students(String FN, String LN, int Sid)
    {
        this.FN=FN;
        this.LN=LN;
        this.Sid=Sid;
    }

    public static void main(String[] args)
    {

        Students s1=new Students();
        Students s2=new Students();
        Students s3=new Students("Shaun","Roberts",  + 100319546);

        System.out.println("First Name: " + s3.FN);
        System.out.println("Last Name: " +s3.LN);
        System.out.println("Student ID: " +s3.Sid);

        System.out.println("First Name: " + s1.FN);
        System.out.println("Last Name: " +s1.LN);
        System.out.println("Student ID: " +s1.Sid);

        System.out.println("First Name: " + s2.FN);
        System.out.println("Last Name: " +s2.LN);
        System.out.println("Student ID: " +s2.Sid);
    }
}