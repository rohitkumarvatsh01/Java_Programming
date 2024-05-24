class A{
    A(){
        System.out.println("Parent Class Constructor");
    }
}
public class SuperKeywordConstructor extends A{

    SuperKeywordConstructor(){
        super();
        System.out.println("Child Class Constructor");
    }

    public static void main(String[] args){
        SuperKeywordConstructor obj=new SuperKeywordConstructor();

    }
}
