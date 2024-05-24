public class OperatorOverloadingPolymorphism {

    void operatorOverloading(int a, int b){
        System.out.println(a+b);
    }

    void operatorOverloading(String str1, String str2){
        String ans=str1+str2;
        System.out.println(ans);
    }
    public static void main(String[] args){
        OperatorOverloadingPolymorphism obj=new OperatorOverloadingPolymorphism();
        obj.operatorOverloading(1,2);
        obj.operatorOverloading("Rohit", "Kumar");
    }
}
