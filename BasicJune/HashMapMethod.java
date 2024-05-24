import java.util.*;
public class HashMapMethod {

    public static void hashMapMethod(){
        Map<String, Integer>mp=new HashMap<>();
        mp.put("Rohit", 21);
        mp.put("Rahul", 22);
        mp.put("Ravi", 23);
        mp.put("Rohan", 24);
        mp.put("Kavi", 25);

        System.out.println(mp.get("Rohit")); //21
        System.out.println(mp.get("Mohit")); //Null

        mp.put("Rohit", 20);
        System.out.println(mp.get("Rohit")); //Update the value
    
        System.out.println(mp.remove("rohit"));
        System.out.println(mp.remove("Mohan"));

        System.out.println(mp.containsKey("Rohit")); //True
        System.out.println(mp.containsKey("Ramu")); //False

        if(!mp.containsKey("Rohit")){
            mp.put("Rohit", 12);
        }

        mp.putIfAbsent("Rohit", 23);
    
    
    
    
    
    
    
    
    }

    public static void main(String[] args){
        hashMapMethod();
    }
}