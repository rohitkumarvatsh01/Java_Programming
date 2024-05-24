public class ComparsionOfTwoString {
    public static void main(String[] args){

        String a="Rohit";
        String b=new String("Rohit");

        if(a==b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        // == it compare object if same type of object and different than compare referance variable

        if(a.equals(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        // equals Method is compare all the contains of String
    }    
}
