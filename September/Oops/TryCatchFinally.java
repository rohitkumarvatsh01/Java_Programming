public class TryCatchFinally {
    public static void main(String[] args){

        System.out.println("Main method is Start");

        try{
            int a=20;
            int b=2;
            int c=a/b;

            System.out.println(c);
        }

        catch(ArithmeticException a){
            System.out.println("Can't Divide by Zero");
        }

        finally{
            System.out.println("Finally Block");
        }

        System.out.println("Main Method is Ended");
    }
}
