package Java.September.Oops;
class TwoClassObjects{
    int id=1;
    String name="Rohit";

    void show(){
        System.out.println(id);
        System.out.println(name);
    }
}
class TwoClassObject{
    public static void main(String[] args){
        TwoClassObjects obj=new TwoClassObjects();
        obj.show();
    }
}
