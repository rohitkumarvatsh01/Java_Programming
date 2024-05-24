public class StringMethod {
    public static void main(String[] args) {
        String a="ROHIT";
        String b="rohit";

        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        System.out.println(a.concat(b));
        System.out.println(b.concat(a));

        System.out.println(a.length());
        System.out.println(b.length());

        String c="        Mohit         ";
        System.out.println(c.trim());

        String d="";
        System.out.println(d.isEmpty());

        System.out.println(a.charAt(2));
        System.out.println(b.indexOf('h'));

        System.out.println(b.equals(a));
        System.out.println(d.replace('r', 'e'));
    }
}
