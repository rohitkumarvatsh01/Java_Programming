public class ReverseString {
    public static void main(String[] args) {
        
        StringBuffer sbf=new StringBuffer("Rohit");
        System.out.println(sbf.reverse());

        StringBuilder sbl=new StringBuilder("Rohit");
        System.out.println(sbl.reverse());

        String a="Rohit";
        String reverse="";
        for(int i=a.length()-1; i>=0; i--){
            reverse=reverse+a.charAt(i);
        }
        System.out.println(reverse);
    }
}
