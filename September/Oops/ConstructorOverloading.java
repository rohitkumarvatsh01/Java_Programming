public class ConstructorOverloading {

    int a;
    String b;
    boolean c;

    ConstructorOverloading(){

        System.out.println(a+" "+b+" "+c);
    }

    ConstructorOverloading(int x){
        a=x;
        
        System.out.println(a);
    }

    ConstructorOverloading(int x, String y){
        a=x;
        b=y;

        System.out.println(a+" "+b);
    }

    ConstructorOverloading(int x, String y, boolean z){
        a=x;
        b=y;
        c=z;

        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args){
        ConstructorOverloading obj1=new ConstructorOverloading();
        ConstructorOverloading obj2=new ConstructorOverloading(200, "Rohit");
        ConstructorOverloading obj3=new ConstructorOverloading(300, "Mohit", true);

    }    
}
