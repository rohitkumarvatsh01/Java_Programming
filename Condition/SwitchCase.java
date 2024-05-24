import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number of Day:- ");
        int day=sc.nextInt();

        switch(day){
            case 1:
            System.out.println("The Day is Monday");
            break;

            case 2:
            System.out.println("The Day is Tusday");
            break;

            case 3:
            System.out.println("The Day is Wednesday");
            break;

            case 4:
            System.out.println("The Day is Thursday");
            break;

            case 5:
            System.out.println("The Day is Friday");
            break;

            case 6:
            System.out.println("The Day is Saturday");
            break;

            case 7:
            System.out.println("The Day is Sunday");
            break;

            default:
            System.out.println("Invalid Days, Please re-enter the Day");
        }
    }
}