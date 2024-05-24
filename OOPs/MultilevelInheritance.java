class Students{
    int roll;
    int marks;
    String name;

    void input(){
        System.out.println("Enter the Input:- ");
    }
}

class Rohits extends Students{
    void dis(){
        roll=1;
        marks=10;
        name="Rohit";

        System.out.println(roll+" "+name+" "+marks);
    }
}

class Rahul extends Rohits{
    void disp(){
        roll=2;
        marks=20;
        name="Rahul";

        System.out.println(roll+" "+marks+" "+name);
    }
}


class MultilevelInheritance{
    public static void main(String[] args){
        Rahul obj=new Rahul();
        obj.input();
        obj.dis();
        obj.disp();
    }

}