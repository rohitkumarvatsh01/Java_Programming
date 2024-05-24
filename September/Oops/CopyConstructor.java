public class CopyConstructor {

    int a;
    String b;

    CopyConstructor(int a, String b){
        System.out.println(a+" "+b);
    }

    CopyConstructor(CopyConstructor obj){
        a=obj.a;
        b=obj.b;

        System.out.println(a+" "+b);
    }

    public static void main(String[] args){
        CopyConstructor obj=new CopyConstructor(10, "Rohit");
    }
}
