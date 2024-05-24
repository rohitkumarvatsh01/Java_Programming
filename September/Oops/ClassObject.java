public class ClassObject {
    int id=10;
    String name="Rohit";

    void show(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args){
        ClassObject obj=new ClassObject();
        obj.show();

        System.out.print(obj.id+" "+obj.name);
    }
}