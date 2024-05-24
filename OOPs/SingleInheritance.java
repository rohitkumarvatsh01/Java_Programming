class Student{
    int roll;
    int marks;
    String name;

    void input(){
        System.out.println("Enter the Input of User:- ");
    }
}

class Rohit extends Student{
    void output(){
        roll=1;
        marks=98;
        name="rohit";

        System.out.println(name+" "+marks+" "+name);
    }
} 

class SingleInheritance{
    public static void main(String[] args){
        Rohit obj=new Rohit();
        obj.input();
        obj.output();
    }
}