public class StringMethod {
    public static void main(String[] args){
        String a="Rohit";
        String b="ROHIT";

        //Lower to Upper Case String
        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());

        //Upper to Lower Case String
        System.out.println(a.toLowerCase());
        System.out.println(b.toLowerCase());

        //Add String
        System.out.println(a.concat(b));
        System.out.println(b.concat(a));

        //Length of String
        System.out.println(a.length());
        System.out.println(b.length());

        //Reverse Space in String Using Trim Method
        String c="     Rahul     ";
        System.out.println(c.trim());

        //To check String is Empty or Not
        String d=" ";
        System.out.println(d.isEmpty());

        //Find the Element in Index String
        System.out.println(a.charAt(2));
        System.out.println(b.charAt(4));

        //Find the Index of Element String
        System.out.println(a.indexOf('R'));
        System.out.println(b.indexOf('t'));

        //Equal Method in String
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));

        //Replace the Letter in String
        System.out.println(a.replace('r','M'));
    }    
}