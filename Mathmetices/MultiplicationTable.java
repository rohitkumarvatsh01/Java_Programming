import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}