public class CountUpperCaseLowerCaseDigits{
    public static void main(String[] args){

        String str="AB12abcDEF45efg";

        int upperCount=0;
        int lowerCount=0;
        int digitCount=0;

        /*
        Method 1
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upperCount++;
            }
            else if(ch>='a' && ch<='z'){
                lowerCount++;
            }
            else if(ch>='0' && ch<='9'){
                digitCount++;
            }
        }
        */

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            else if(Character.isLowerCase(ch)){
                lowerCount++;
            }
            else if(Character.isDigit(ch)){
                digitCount++;
            }
        }

        System.out.println("Count of LowerCase:- "+lowerCount);
        System.out.println("Count of UpperCase:- "+upperCount);
        System.out.println("Count of DigitCase:- "+digitCount);
    }
}