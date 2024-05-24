public class RotationString {
    public static void main(String[] args){
        String str1="ABCD";
        String str2="CDAB";

        String str3=str1+str2;
        if(str3.indexOf(str2)!=-1){
            System.out.println("Rotation");
        }
        else{
            System.out.println("Not Rotation");
        }
    }
}
