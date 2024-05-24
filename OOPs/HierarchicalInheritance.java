class A{
    void input(){
        System.out.println("Enter the Input:- ");
    }
}

class B extends A{
    void show(){
        System.out.println("My name is Rohit");
    }
}

class C extends A{
    void dis(){
        System.out.println("My name is Rohan");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args){
        B obj1=new B();
        C obj2=new C();
    
        obj1.input();
        obj1.show();
    
        obj2.dis();
    }
    
}
