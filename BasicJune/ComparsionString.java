public class ComparsionString{
    public static void main(String[] args){
        String a="Rohit";
        //String b="Rohit";
        String b=new String("Rohit");

        //Methods-1
        if(a==b){
            System.out.println("String is Equal");
        }
        else{
            System.out.println("String is Unequal");
        }

        //Methods-1
        if(a.equals(b)){
            System.out.println("String is Equal");
        }
        else{
            System.out.println("String is Unequal");
        }
    }
}