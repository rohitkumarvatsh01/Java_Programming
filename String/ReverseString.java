public class ReverseString {
    public static void main(String[] args){

        String a="Rohit Kumar";

        //String Buffer Method
        StringBufferAndBuilder obj= new StringBufferAndBuilder(a);
        System.out.println(obj.reverse());

        //String Bulider Method
        StringBuilderMethod obj1=new StringBuilderMethod(a);
        System.out.println(obj1.reverse());

        //Own Method
        String reverse="";
        for(int i=a.length()-1; i>=0; i--){
            reverse=reverse + a.charAt(i);
        }

        System.out.println(reverse);
    }
}
