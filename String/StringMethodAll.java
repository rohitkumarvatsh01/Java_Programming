public class StringMethodAll{
    public static void main(String[] args){

        String str1="Rohit Kumar";
        String str2="ROHIT KUMAR";

        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));

        System.out.println(str1.length());
        System.out.println(str2.length());

        String str3=    "String Space Remove"   ;
        System.out.println(str3.trim());

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());

        System.out.println(str1.charAt(2));
        System.out.println(str2.indexOf('H'));

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));

        System.out.println(str1.replace('o', 'I'));
        System.out.println(str2.replace('H', 'o'));
    }
}