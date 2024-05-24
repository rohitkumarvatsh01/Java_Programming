public class StringLiteral{
    public static void main(String[] args){

        //String Literal
        String a="Rohit";
        String b="Rohit";
        System.out.println(a);
        System.out.println(b);

        a.concat(b);
        System.out.println(a);

        //String New keyword
        String c=new String("rahul");
        System.out.println(c);

        c.concat(c);
        System.out.println(c);

        c=c.concat(a);
        System.out.println(c);
    }
}