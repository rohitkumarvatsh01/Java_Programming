public class Student{
    int rollNo;
    String name;
    
    public static void main(String[] args){
        Student obj1=new Student();
        Student obj2=new Student();
        Student obj3=new Student();
        Student obj4=new Student();
        Student obj5=new Student();


        obj1.rollNo=1;
        obj1.name="Rohit";

        obj2.rollNo=2;
        obj2.name="Rahul";

        obj3.rollNo=3;
        obj3.name="Rohan";

        obj4.rollNo=4;
        obj4.name="Ram";

        obj5.rollNo=5;
        obj5.name="Rai";

        System.out.println(obj1.rollNo);
        System.out.println(obj1.name);
        System.out.println();

        System.out.println(obj2.rollNo);
        System.out.println(obj2.name);
        System.out.println();

        System.out.println(obj3.rollNo);
        System.out.println(obj3.name);
        System.out.println();

        System.out.println(obj4.rollNo);
        System.out.println(obj4.name);
        System.out.println();

        System.out.println(obj5.rollNo);
        System.out.println(obj5.name);
        System.out.println();
    }
}