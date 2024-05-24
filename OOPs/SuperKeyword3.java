class A{
    A(){
        System.out.println("Hello Class 1");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("Hello Class 2");
    }
}

class SuperKeyword3{
    public static void main(String[] args){
        B obj=new B();
    
    }
}