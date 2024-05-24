class CopyConstructor{

    int a;
    String name;

    CopyConstructor(){
        a=100;
        name="Rohit";
        System.out.println(a+" "+name);
    }

    CopyConstructor(CopyConstructor ref){
        a=ref.a;
        name=ref.name;
        System.out.println(a+" "+name);
    }

    public static void main(String[] args){
        CopyConstructor obj=new CopyConstructor();
        CopyConstructor obj2=new CopyConstructor(obj);
    }
}