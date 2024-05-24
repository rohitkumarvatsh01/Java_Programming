class Student{
    int rollNo;
    String name;
    int marks;
}

class SingleInheritance extends Student{
    void show(){
        rollNo=1;
        name="Rohit";
        marks=100;

        System.out.println(rollNo+" "+name+" "+marks);
    }

    public static void main(String[] args){
        SingleInheritance obj=new SingleInheritance();
        obj.show();
    }
}