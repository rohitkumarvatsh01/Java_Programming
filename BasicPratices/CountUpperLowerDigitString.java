import java.util.Scanner;
public class CountUpperLowerDigitString{

    public static void countUpperLowerDigit(String str){
        int lowerCount=0;
        int upperCount=0;
        int digitCount=0;
        int specialCount=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                lowerCount++;
            }
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                upperCount++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digitCount++;
            }
            else{
                specialCount++;
            }
        }

        System.out.println("Lower Count:- "+lowerCount);
        System.out.println("Upper Count:- "+upperCount);
        System.out.println("Digit Count:- "+digitCount);
        System.out.println("Special Count:- "+specialCount);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:-");
        String str=sc.nextLine();

        countUpperLowerDigit(str);
    }
}
    
