public class ArrayBasic{
    void DemoArray(){
        int[]ages=new int[3];
        ages[0]=1;
        ages[1]=2;
        ages[2]=3;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
    public static void main(String[] args){
        ArrayBasic obj = new ArrayBasic();
        obj.DemoArray();
    }
}