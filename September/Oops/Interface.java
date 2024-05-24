interface Animal{
    public void animalSound();
    public void sleep();
}

class Dog implements Animal{

    public void animalSound(){
        System.out.println("Bhoo Bhoo");
    }
    
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class Interface{
    public static void main(String[] args){
        Dog obj=new Dog();
        obj.animalSound();
        obj.sleep();
    }
}