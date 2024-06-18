package OOPS;

public class New {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollNo = 10;
        s1.name = "Abi";
        System.out.print(s1.rollNo+":");
        System.out.println(s1.name);
//////////////////////////////////////////////
        Student s2 = new Student();
        s2.rollNo = 11;
        s2.name = "Bibi";
        System.out.print(s2.rollNo+":");
        System.out.println(s2.name);
//////////////////////////////////////////////
        Student s3 = new Student();
        s3.rollNo = 13;
        s3.name = "Cibi";
        System.out.print(s3.rollNo+":");
        System.out.println(s3.name);
//////////////////////////////////////////////
        Student s4 = new Student();
        s4.rollNo = 14;
        s4.name = "Didi";
        System.out.print(s4.rollNo+":");
        System.out.println(s4.name);
    }
}
