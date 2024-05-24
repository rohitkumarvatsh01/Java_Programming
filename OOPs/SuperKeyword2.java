class A{
    void show(){
        System.out.println("Class 1");
    }
}
class B extends A{
    void show(){
        super.show();
        System.out.println("Class 2");
    }
}
class SuperKeyword2{
    public static void main(String[] args){
        B obj=new B();
        obj.show();
    }
}