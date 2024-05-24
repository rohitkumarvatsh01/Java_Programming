class A{
    void input(){
        System.out.println("Enter the Name:- ");
    }
}

class B extends A{
    void show(){
        System.out.println("Name:- Rohit");
    }
}

class HierarchicalInheritance extends A{
    void display(){
        System.out.println("Name:- Rahul");
    }

    public static void main(String[] args){
        B obj1=new B();
        HierarchicalInheritance obj2=new HierarchicalInheritance();
        obj1.input();
        obj1.show();

        obj2.input();
        obj2.display();
    }
}
