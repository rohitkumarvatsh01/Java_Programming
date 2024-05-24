import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args){

        ArrayList<Integer>ans=new ArrayList<>();
        
        //Add element in ArrayList
        ans.add(0);
        ans.add(1);
        ans.add(2);
        ans.add(3);
        System.out.println(ans);

        //Get the element in ArrayList;=
        int get=ans.get(1);
        System.out.println(ans);

        //Add element between the Index
        ans.add(1,2);
        System.out.println(ans);

        //Set the Element in ArrayList
        ans.set(0,10);
        System.out.println(ans);

        //Remove the element in ArrayList
        ans.remove(2);
        System.out.println(ans);

        //Size of ArrayList
        int size=ans.size();
        System.out.println("Size of ArrayList:- "+size);

        //Loop for in ArratList
        for(int i=0; i<size; i++){
            System.out.print(ans.get(i)+" ");
        }

        System.out.println();
        
        //Sorting ArrayList
        ans.add(1);
        Collections.sort(ans);
        System.out.println(ans);
    }
}