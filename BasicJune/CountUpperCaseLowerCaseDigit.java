import java.util.Scanner;

import javax.sql.rowset.spi.SyncProviderException;
public class CountUpperCaseLowerCaseDigit {

    public static void count(String str){
        
        int upperCount=0;
        int lowerCount=0;
        int digitCount=0;
        int specialCount=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                upperCount++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                lowerCount++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digitCount++;
            }
            else{
                specialCount++;
            }
        }

        System.out.println("Count of Upper Case:- "+upperCount);
        System.out.println("Count of Lower Case:- "+lowerCount);
        System.out.println("Count of Digit:- "+digitCount);
        System.out.println("Count of Special:- "+specialCount);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        count(str);
    }
}
