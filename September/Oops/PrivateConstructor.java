public class PrivateConstructor {

    int a;
    String b;
    boolean c;

    private PrivateConstructor(){
        a=10;
        b="Rohit";
        c=true;

        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args){
        PrivateConstructor obj=new PrivateConstructor();
    }    
}
