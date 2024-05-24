public class InstanceBlock {

    int a;
    int b;

    {
        a=10;
        b=20;

        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();
    }
}
