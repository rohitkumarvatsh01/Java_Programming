class A
{
    void input()
    {
        System.out.println("Enter your name");
    }
}
 class B extends A
{
    void show()
    {
        System.out.println("My name is Ram Pratap Singh");
    }

}
 class C extends B 
{
    void display()
    {
        System.out.println("My name is Sumit");
    }
}
class Lecture9
{
    public static void main(String[] args) {
        B r=new B();
        C r2=new C();

        r.input(); r.show();
        r2.input(); r2.display();
    }
}