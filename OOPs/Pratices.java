class Aa{
    int a=10;
    int b=20;
    int c;

    void sum(int a, int b){
        c=a+b;

        System.out.println(c);
    }
}

class Bb extends Aa{
    void sub(int a, int b){
        c=a-b;
        System.out.println(c);
    }
}

class Pratices{
    Bb obj=new Bb();
    obj.sum();
    obj.sub();
}