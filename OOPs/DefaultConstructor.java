class DefaultConstructor{

    int a;
    String name;

    DefaultConstructor(){
        a=0;
        name=null;
    }
     
    void show(){
        System.out.println(a+" "+name);
    }
    
    public static void main(String[] args){
        DefaultConstructor obj=new DefaultConstructor();
        obj.show();

        //System.out.println(obj.a+" "+obj.name);
    }
}