class A{
    
    int a=10;
    int b=5;
    int c;
    
    void sum(){
        c=a+b;
        System.out.println("Addition:- "+c);
    }
}

class B extends A{
    void sub(){
        c=a-b;
        System.out.println("Substraction:- "+c);
    }
}

class C extends B{
    void mul(){
        c=a*b;
        System.out.println("Multipilication:- "+c);
    }
}

class D extends C{
    void div(){
        c=a/b;
        System.out.println("Division:- "+c);
    }
}

class E extends D{
    void modu(){
        c=a%b;
        System.out.println("Modules:- "+c);
    }
}

class Multilevel{
    public static void main(String[] args){
        E obj=new E();

        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();
        obj.modu();
    }
}