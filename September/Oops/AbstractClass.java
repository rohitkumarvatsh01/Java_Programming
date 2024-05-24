abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzzz");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bhoo Bhoo");
    }
}

class AbstractClass{
    public static void main(String[] args){
        Dog obj=new Dog();
        obj.animalSound();
        obj.sleep();
    }
}