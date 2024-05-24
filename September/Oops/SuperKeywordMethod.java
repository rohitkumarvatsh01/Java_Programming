class A{
    void show(){
        System.out.println("Parent Class");
    }
}
public class SuperKeywordMethod extends A{
    void show(){
        super.show();
        System.out.println("Child Class");
    }

    public static void main(String[] args){
        SuperKeywordMethod obj=new SuperKeywordMethod();
        obj.show();
    }
}

