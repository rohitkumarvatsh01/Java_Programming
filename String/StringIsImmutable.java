public class StringIsImmutable {
    public static void main(String[] args){

        String str1="Ram";
        String str2=str1;

        System.out.println("String1:- "+str1);
        System.out.println("String2:- "+str2);

        str1="Sita";

        System.out.println("String1:- "+str1);
        System.out.println("String2:- "+str2);
    }
}
