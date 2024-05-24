public class CountWord {
    public static void main(String[] args) {
        
        String str="I Am Programmer";
        int count=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }

        System.out.println("Count of Words is:- "+(count+1));
    }
}
