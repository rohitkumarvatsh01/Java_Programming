class A{
    private int value;

    public void setValue(int x){
        value=x;
    }

    public int getValue(){
        return value;
    }
}
public class Main{
    public static void main(String[] args){
        A obj=new A();
        obj.setValue(1000);
        System.out.println(obj.getValue());
    }
}