import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args){

        String str="abbabba";
        String str2="";
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the character:- ");
        char ch=sc.next().charAt(0);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch){
                str2+=str.charAt(i);
            }
        }

        System.out.println(str2);
    }
}
