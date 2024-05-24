class A{
    int a;
    int b;;

    A(int x, int y){
        x=a;
        y=b;
    }

    void show(){
        System.out.println(a+" "+b);
    }
}

public class ClassClass{
    public static void main(String[] args) {
        A obj=new A(10, 100);
        obj.show();
    }
}