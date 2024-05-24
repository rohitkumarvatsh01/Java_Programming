import java.util.ArrayList;
public class ArrayListImplementation{
    public static void main(String[] args){

        //Declearation of ArrayList
        ArrayList<Integer>ans=new ArrayList<>();

        //Add Element in ArrayList
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);

        //Get Element in ArrayList
        System.out.println(ans.get(0));

        //Print All Element in ArrayList Using For Loop
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

        //Print All Element in ArrayList Direct
        System.out.println(ans+" ");

        //Add Element in Some Index in ArrayList
        ans.add(1, 100);
        System.out.println(ans);

        //Modifying Element in Index
        ans.set(3, 200);
        System.out.println(ans);

        //Remove Element in ArrayList
        ans.remove(3);
        System.out.println(ans);
 
        //Remove Value from ArrayList
        ans.remove(Integer.valueOf(100));
        System.out.println(ans);

        //Check Value is Present in ArrayList
        boolean result=ans.contains(Integer.valueOf(1));
        System.out.println(result);

        //Size of ArrayList
        int size=ans.size();
        System.out.println("Size of ArrayList is:- "+size);;


        //Create New ArrayList name is list
        ArrayList list=new ArrayList<>();
        
        //Add Integer, String, Boolean in ArrayList
        list.add(1);
        list.add("Rohit");
        list.add(true);

        //Print ArrayList
        System.out.println(list);

    }
}