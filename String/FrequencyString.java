import java.util.Scanner;
public class FrequencyString{

    public static void frequencyString(String str){
        
        char[] ch=str.toCharArray();
        int[] freq=new int[str.length()];

        for(int i=0; i<str.length(); i++){
            freq[i]=1;
            for(int j=i+1; j<str.length(); j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }

        for(int i=0; i<freq.length; i++){
            if(ch[i]!=' ' && ch[i]!='0'){
                System.out.println(ch[i]+"-"+freq [i]);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        frequencyString(str);
    }
}