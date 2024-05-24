public class ReverseStringAllMethod{
    public static void main(String[] args){

        String str="Rohit Kumar";

        StringBufferAndBuilder obj=new StringBufferAndBuilder(str);
        System.out.println(obj.reverse());

        StringBuilderMethod obj1=new StringBuilderMethod(str);
        System.out.println(obj1.reverse());

        String reverse="";
        char ch;
        for(int i=str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}