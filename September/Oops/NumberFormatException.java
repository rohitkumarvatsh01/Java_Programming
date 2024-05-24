public class NumberFormatException {
    public static void main(String[] args){
        
        String str="Rohit";

        try{
            int a=Integer.parseInt(str);
        }

        catch(NumberFormatException n){
            System.out.println("String can't be convert Integer");
        }
    }
}
