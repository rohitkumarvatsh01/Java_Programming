public class MethodLevelScope{
    int add(){
        int a=10;  // a and b are accessble in only inside a method
        int b=10;
        return a+b;
    }

    //It is not accessable outside of the method

    int sub(){
        int a=10;
        int b=10;
        return a-b;
    }

    public static void main(String[] args){
        MethodLevelScope obj = new MethodLevelScope();

        System.out.println(obj.add);
        System.out.println(obj.sub);
    }
}