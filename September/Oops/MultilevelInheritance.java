class Add {
    int a;
    int b;
    int c;

    void add(){
        a=10;
        b=20;
        c=a+b;

        System.out.println("Add:- "+c);
    }
}

class Sub extends Add{
    void sub(){
        a=20;
        b=10;
        c=a-b;
        System.out.println("Sub:- "+c);
    }
}

class Mul extends Sub{
    void mul(){
        a=20;
        b=10;
        c=a*b;

        System.out.println("Mul:- "+c);
    }
}

class MultilevelInheritance extends Mul{
    void div(){
        a=10;
        b=20;
        c=a/b;

        System.out.println("Div:- "+c);
    }

    public static void main(String[] args){
        MultilevelInheritance obj=new MultilevelInheritance();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
