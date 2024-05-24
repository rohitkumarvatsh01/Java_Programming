public class ClassInsideClass {
    int id=1;
    String name="Rohit";

    void show(){
        System.out.println(id);
        System.out.println(name);
    }
}

class Test{
    public static void main(String[] args){
        ClassInsideClass obj=new ClassInsideClass();
        obj.show();
    }
}
