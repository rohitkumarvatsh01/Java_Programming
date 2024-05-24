import java.util.HashMap;
public class HashMapImplementation {
    public static void main(String[] args){

        //Decleration of HashMap
        HashMap<Integer, String>ans=new HashMap<>();
        
        //Add Element in HashMap
        ans.put(2,"Rohan");
        ans.put(1,"Rohit");
        ans.put(4,"Mohit");
        ans.put(3,"Rahul");

        //Print All Element From HashMap with Key-Pair Value
        System.out.println(ans);

        //Get the element of Key using get method
        System.out.println(ans.get(2));

        //To check Key Present or Not in HashMap
        System.out.println(ans.containsKey(3));

        //To check value Present or Not in HashMap
        System.out.println(ans.containsValue("Rohiti"));

        //Print All Element in HashMap
        System.out.println(ans.entrySet());

        //Print all the Keys of HashMap
        System.out.println(ans.keySet());

        //Print all the Values of HashMap
        System.out.println(ans.values());
    }
}