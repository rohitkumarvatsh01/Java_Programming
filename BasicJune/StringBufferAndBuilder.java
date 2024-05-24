public class StringBufferAndBuilder {
    public static void main(String[] args){
        ReverseString sb=new ReverseString("Rohit Kumar");
        System.out.println(sb.reverse());

        StringBuilderMethod sbb=new StringBuilderMethod("Rohit Kumar");
        System.out.println(sbb.reverse());
    }
}
