public class StringBuilderMethod {
    public static void main(String[] args){
        StringBuilder str=new StringBuilder("Hello");

        //Set
        str.setCharAt(1,'m');
        System.out.println(str);

        //Append
        str.append("world");
        System.out.println(str);

        //Insert
        str.insert(2,'y');
        System.out.println(str);

        //Delete
        str.deleteCharAt(0);
        System.out.println(str);

        //Reverse
        str.reverse();
        System.out.println(str);
    }
}
