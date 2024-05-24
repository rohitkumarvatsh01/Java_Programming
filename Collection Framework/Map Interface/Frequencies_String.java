import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Frequencies_String {

    public static void frequenciesString(String str){
        
        Map<Character, Integer>map=new HashMap<>();
        char[] charArray=str.toCharArray();

        for(char c:charArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        frequenciesString(str);
    }
}