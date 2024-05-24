public class ThisKeyword{
    int a;

    void show(){
        System.out.println("this");
    }

    public static void main(String[] args){
        ThisKeyword obj=new ThisKeyword();
        System.out.println(obj);
        obj.show();
    }
}

