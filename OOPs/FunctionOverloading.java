public class FunctionOverloading {

    void sum(int a){
        System.out.println(a);
    }

    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args){
        FunctionOverloading obj=new FunctionOverloading();

        obj.sum(10);
        obj.sum(10,20);
        obj.sum(10,20,30);
        obj.sum(10,20,30,40);
    }
}
