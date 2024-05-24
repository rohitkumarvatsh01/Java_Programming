class A {
    void m1(){
        System.out.println("Parent Class1");
    }
}

class B{
    void m2(){
        System.out.println("Parent Class2");
    }
}

class MultipleInheritance extends A B{
    void m3(){
        System.out.println("C is Confusion");
    }

    public static void main(String[] args){
        MultipleInheritance obj=new MultipleInheritance();
        obj.m3();
    }
}
