public class StringToCharacter{
    public static void main(String[] args){

        String str="Rohit kumar";
        char[] ch=new char[str.length()];

        for(int i=0; i<str.length(); i++){
            ch[i]=str.charAt(i);
        }

        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }

        System.out.println();
        System.out.println("Method-2:- ");

        char ch1[]=str.toCharArray();
        for(int i=-0; i<ch1.length; i++){
            System.out.print(ch1[i]+" ");
        }

    }
}