public class ExceptionHandling {
    public static void main(String[] args){
        System.out.println("Main Method Started");

        int a=10;
        int b=0;
        int c;

        try{
            c=a/b;
            System.out.println(c);
        }

        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Main Method is Ended");
    }
}
