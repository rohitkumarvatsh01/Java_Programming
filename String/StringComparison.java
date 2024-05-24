public class StringComparison {
    public static void main(String[] args) {
        

        //== comparesion
        String a="Rohit";
        String b="Rohit";

        if(a==b){
            System.out.println("A is Equal to B");
        }
        else{
            System.out.println("A is Not Equal to B");
        }

        //Equal to 
        String c="Rohit";
        String d=new String("Rohit");

        if(c.equals(d)){
            System.out.println("A is Equal to B");
        }
        else{
            System.out.println("A is Not Equal to B");
        }

    }
}
