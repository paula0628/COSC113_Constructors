public class Students
{
    //attributes
    String FN;
    String LN;
    int Sid;

    // This is static method
    // Methods can be static and non-static
    // This method returns nothing - return type is void
    // Return/Parameter types can be - int, float, double, boolean, String, char

    // method name - main
    // JVM accesses the static method using ClassName.MethodName executes
    // JVM executes Student.main
    public static void main(String[] args)
    {
        //If constructors are not defined, JVM will provide a default constructor
        Students s1=new Students();
        s1.FN="Tabitha";
        s1.LN="Thomas";
        s1.Sid=100413877;

        //Use of dot operator (.)
        System.out.println("First Name: " + s1.FN);
        System.out.println("Last Name: " +s1.LN);
        System.out.println("Student ID: " +s1.Sid);
        System.out.println("Hello Constructors");
    }
}