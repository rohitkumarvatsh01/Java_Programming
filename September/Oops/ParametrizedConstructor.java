public class ParametrizedConstructor {

    int a;
    int b;

    ParametrizedConstructor(int x, int y){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args){
        ParametrizedConstructor obj=new ParametrizedConstructor(100, 200);
    }
}
