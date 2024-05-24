import java.util.Scanner;
public class CheckOccurance {

    public static int occurance(String str, String x){
        for(int i=0; i<str.length(); i++){
            if(str.contains(x)){
                return str.indexOf(x);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the Occurance:- ");
        String x=sc.nextLine();

        System.out.println(occurance(str, x));
    }
}
