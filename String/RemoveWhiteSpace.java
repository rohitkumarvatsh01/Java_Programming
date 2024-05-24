public class RemoveWhiteSpace {
    public static void main(String[] args){

        String str="I am Programmer";
        String str1="";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
