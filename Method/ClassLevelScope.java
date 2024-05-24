public class ClassLevelScope{
    int a=10; //Class level scope
    int b=20; //Class level scope

    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }

    public static void main(String[] args){
        ClassLevelScope obj=new ClassLevelScope();

        System.out.println(obj.add());
        System.out.println(obj.sub());

        //System.out.println(a); yha a accsessable na haii
    }

}
