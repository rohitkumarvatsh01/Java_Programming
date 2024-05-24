import java.util.Scanner;

public class Ages{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Current Age:- ");
        int age=sc.nextInt();

        if(age<=17){
            System.out.println("You are not Drive");
        }
        else if((age>=18) && (age<60)){
            System.out.println("You are Drive");
        }
        else{
            System.out.println("Take Rest");
        }
    }
}