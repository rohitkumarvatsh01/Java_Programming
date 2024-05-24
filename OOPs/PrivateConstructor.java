public class PrivateConstructor{
    int a;
    double b;
    String c;

    private PrivateConstructor(){
        a=10;
        b=20.22;
        c="Rohit";

        System.out.println(a+" "+b+" "+c);
    }

    void show(){
        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args){
        PrivateConstructor obj=new PrivateConstructor();
        obj.show();
    }
}