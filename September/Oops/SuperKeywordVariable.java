class A{
    int a=10;
}

public class SuperKeywordVariable extends A{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }

    public static void main(String[] args){
        SuperKeywordVariable obj=new SuperKeywordVariable();
        obj.show();
    }
}
