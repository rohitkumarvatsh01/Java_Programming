class Shape{
    void draw(){
        System.out.println("Can't say shape type");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Square shape");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        Shape obj=new Square();
        obj.draw();
    }
}
