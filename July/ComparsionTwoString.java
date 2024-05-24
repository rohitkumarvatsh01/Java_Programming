public class ComparsionTwoString {
    public static void main(String[] args) {
        
        String a=new String("Rohit");
        String b="Rohit";

        if(a==b){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(a.equals(b)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
