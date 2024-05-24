class Shape{
    void draw(){
        System.out.println("Can't Say type");
    }
}

class Square extends Shape{
    //@override
    void draw(){
        super.draw();
        System.out.println("Square Shape");
    }
}

public class MethodOverridingPolymorphism {
    public static void main(String[] args){
        Shape obj=new Square();
        obj.draw();
    }
}
