public class StringNewKeyword {
    public static void main(String[] args){
        String a=new String("Rohit");
        System.out.println(a);

        String b=new String("Rohit");
        System.out.println(b);
    
        a.concat("Kumar"); //Nhi hoga
        a=a.concat(" Kumar"); // Hoga
        System.out.println(a);

    }
}
