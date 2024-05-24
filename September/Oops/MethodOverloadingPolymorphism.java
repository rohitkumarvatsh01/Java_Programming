public class MethodOverloadingPolymorphism {
    void add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args){
        MethodOverloadingPolymorphism obj=new MethodOverloadingPolymorphism();
        obj.add();
        obj.add(10, 20, 30);
        obj.add(10, 20, 30, 40);
    }
}
