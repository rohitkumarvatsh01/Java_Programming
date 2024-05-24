public class StringMethod {
    public static void main(String[] args){
        String a="Rohit";
        String b="Rohit";

        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());

        System.out.println(a.toLowerCase());
        System.out.println(b.toLowerCase());

        System.out.println(a.concat(b));
        System.out.println(b.concat(a));

        System.out.println(a.length());
        System.out.println(b.length());

        String c="          Kumar           ";
        System.out.println(c.trim());

        String d="";
        System.out.println(a.isEmpty());
        System.out.println(d.isEmpty());

        System.out.println(a.charAt(1));
        System.out.println(b.indexOf('i'));

        System.out.println(a.equals(b));
        System.out.println(b.equals(a));

        System.out.println(a.replace('r','m'));
        System.out.println(a.replace('o','i'));


    }
}
