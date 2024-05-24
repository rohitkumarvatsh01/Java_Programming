public class StringNewKeyword {
    public static void main(String[] args){

        String a=new String("Rohit");
        System.out.println(a);

        String b=new String("Rohit");
        System.out.println(b);

        a.concat("kumar");
        System.out.println(a);

        a=a.concat("Kumar");
        System.out.println(a);
    }
}
