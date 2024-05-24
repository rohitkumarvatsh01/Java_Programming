import java.util.Scanner;
public class PrintAllSubstring {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
