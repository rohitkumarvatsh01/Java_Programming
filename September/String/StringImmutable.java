public class StringImmutable {
    public static void main(String[] args){

        String str1="Rohit";
        String str2=str1;

        System.out.println(str1);
        System.out.println(str2);

        str1="Sita";

        System.out.println(str1);
        System.out.println(str2);
    }
}
