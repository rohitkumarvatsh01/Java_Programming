class Multi{
    void sup(){
        System.out.println("Super Class 1");
    }
}

class MultiA extends Multi{
    void sub1(){
        System.out.println("Sub-Class 1");
    }
}

class MultiB extends Multi{
    void sub2(){
        System.out.println("Sub-Class 2");
    }
}

class MultipleInheritance{
    public static void main(String[] args){
        Multi obj=new Multi();
        obj.sup();
        obj.sub1();

    }
}