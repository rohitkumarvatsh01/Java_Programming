import java.util.Scanner;
public class FrequencyOfString{

    public static void frequencyOfString(String str){
        str=str.toLowerCase();

        for(char ch='a'; ch<='z'; ch++){
            int count=0;
            for(int i=0; i<str.length(); i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            System.out.println(ch+" "+count);
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        frequencyOfString(str);
    }
}