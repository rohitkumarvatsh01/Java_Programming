public class StringMethod {
    public static void main(String[] args){

        String a="ROHIT";
        String b="Rahul";

        //Lower case to Upper case
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        //Concat two String
        System.out.println(a.concat(b));
        System.out.println(b.concat(a));

        //Length
        System.out.println(a.length());
        System.out.println(b.length());

        //Remove space
        String c=    "Ram"   ;
        System.out.println(c.trim());

        //Empty or not
        System.out.println(a.isEmpty());
        String d=" ";
        System.out.println(d.isEmpty());

        //Equal or not
        System.out.println(b.equals(a));
        System.out.println(a.replace('T', 'O'));
    }
}
