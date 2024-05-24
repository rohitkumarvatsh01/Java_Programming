class Student {
    
    int rollNo;
    String studentname;
    String collegename;
    String coste;
}

public class Main {
    public static void main(String[] args) {
        
        Student obj1  = new Student();
        
        obj1.rollNo = 12;
        obj1.studentname = "Rohan";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentname);



        Student obj2 = new Student();
        obj2.rollNo = 14;
        obj2.studentname = "Mohit";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentname);


        Student obj3 = new Student();
        obj3.collegename = "Aktu";
        obj3.coste = "General";
        System.out.println(obj3.collegename);
        System.out.println(obj3.coste);

    }
}
