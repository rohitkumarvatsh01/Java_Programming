public class ComparsionString {
    public static void main(String[] args){
        
        String a="Rohit";
        String b=new String("Rohit");

        // if(a==b){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }

        if(a.equals(b)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
