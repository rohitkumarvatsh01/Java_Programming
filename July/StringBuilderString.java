public class StringBuilderString {
    public static void main(String[] args){

        StringBuilder str=new StringBuilder("Hello");
        System.out.println(str);

        str.setCharAt(1,'m');
        System.out.println(str);

        str.append("world");
        System.out.println(str);

        str.insert(2,'y');
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str);

        StringBuilder sb=new StringBuilder("Rohit");
        sb.reverse();
        System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);
    }
}
