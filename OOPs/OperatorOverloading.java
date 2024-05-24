public class OperatorOverloading {

    void overloading(int a, int b){
        int c=a+b;
        System.out.println(c);
    }

    void overloading(String str1, String str2){
        String c=str1 + str2;
        System.out.println(c);
    }

    public static void main(String[] args){
        OperatorOverloading obj=new OperatorOverloading();
        obj.overloading(10,20);
        obj.overloading("Rohit","Kumar");
    }
}
