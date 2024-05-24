public class Pass_by_value{
    static void changevalue(int a){
        a=a+10;
        System.out.println("Inside change value:- "+a);
    }

    public static void main(String[] args){
        int a=10;
        System.out.println("Before change value:- "+a);
        changevalue(a);
        System.out.println("After change value:- "+a);
    }
}

//Note:- Pass By Value
// 1 copies the value of actual parameters.
// 2 called function creates its own copies.
// 3 java is supported the pass by value.

//Note:- Pass By Reference
// 1 pass the parameter as the reference or address.
// 2 called function does not create its own copy.
// 3 java is not supported pass by reference.