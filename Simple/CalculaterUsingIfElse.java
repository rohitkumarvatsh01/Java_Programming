import java.util.Scanner;
public class CalculaterUsingIfElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the numb2:- ");
        int num2=sc.nextInt();

        System.out.println("Choose the Number (1, 2, 3, 4):- ");
        int ch=sc.nextInt();

        int ans;

        if(ch==1){
            ans=num1+num2;
            System.out.println("Addition:- "+ ans);
        }
        else if(ch==2){
            ans=num1-num2;
            System.out.println("Subractiion:- "+ ans);
        }
        else if(ch==3){
            ans=num1*num2;
            System.out.println("Multiplication:- "+ ans);
        }
        else if(ch==4){
            ans=num1/num2;
            System.out.println("Divison:- "+ ans);
        }
        else{
            System.out.println("Invalid Option");
        }
    }
}
