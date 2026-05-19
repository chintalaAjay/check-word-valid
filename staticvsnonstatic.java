public class staticvsnonstatic {
    static String clg="10k";
    String branch;
    static int passedout=2026;
    String fathername;
    String mothername;


    public static void main(String[] args) {
        staticvsnonstatic s1= new staticvsnonstatic();
        s1.branch="Mech";
        s1.fathername="Ram";
        s1.mothername="sita";
        System.out.println("college name is "+clg);
        System.out.println("branch is "+s1.branch);
        System.out.println("passed out year is "+passedout);
        System.out.println("father name is "+s1.fathername);
        System.out.println("mother name is "+s1.mothername);
        System.out.println("-----------------------------");
        staticvsnonstatic s2=new staticvsnonstatic();
        s2.branch="CSE";
        s2.fathername="Ganesh";
        s2.mothername="Lakshmi";
        System.out.println("college name is "+clg);
        System.out.println("branch is "+s2.branch);
        System.out.println("passed out year is "+passedout);
        System.out.println("father name is "+s2.fathername);
        System.out.println("mother name is "+s2.mothername);
    }
}
