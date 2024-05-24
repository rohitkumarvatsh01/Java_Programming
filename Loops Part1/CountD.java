import java.util.Scanner;
class CountD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sum=0;

        while(n>0){
            int n1=n%10;
            sum+=n1;
            n=n/10;
        }
        System.out.println(sum);
    }
}