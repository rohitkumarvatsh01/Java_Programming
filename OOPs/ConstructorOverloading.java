public class ConstructorOverloading {

    int a;
    double b;
    String c;

    ConstructorOverloading(){
        a=10; b=10.22; c="Rohit";
    }

    ConstructorOverloading(int x, double y){
        x=a;
        y=b;
    }

    ConstructorOverloading(int x, double y, String z){
        x=a;
        y=b;
        z=c;
    }

    public static void main(String[] args){
        ConstructorOverloading obj1=new ConstructorOverloading();
        ConstructorOverloading obj2=new ConstructorOverloading(10, 20.22);
        ConstructorOverloading obj3=new ConstructorOverloading(20, 20.22, "Rohit");

        System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);
        System.out.println(obj2.a+" "+obj2.b);
        System.out.println(obj3.a+" "+obj3.b+" "+obj3.c);
    }
}
