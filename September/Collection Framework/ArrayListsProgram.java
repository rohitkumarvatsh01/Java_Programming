import java.util.ArrayList;
public class ArrayListsProgram{

    //Main Method
    public static void main(String[] args){

        //Decleration of ArrayList
        ArrayList<Integer>ans=new ArrayList<>();

        //Add Element in ArrayList
        ans.add(1);
        ans.add(2);
        ans.add(3);

        //ArrayList Print with Get Method
        System.out.println(ans.get(0));
        System.out.println(ans.get(1));
        System.out.println(ans.get(2));

        //ArrayList Print with for Loop
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }

        //ArrayList print Directly
        System.out.println(ans);

        //Add Element at some Index
        ans.add(1,100);
        System.out.println(ans); 

        //Modifying Element in Index
        ans.set(1, 50);
        System.out.println(ans);

        //Remove Element in Index
        ans.remove(1);
        System.out.println(ans);

        //Remove Element in ArrayList
        ans.remove(Integer.valueOf(2));
        System.out.println(ans);

        //Checking if Element Exists
        boolean check=ans.contains(Integer.valueOf(3));
        System.out.println(check);

        //If you don't specify class than you can put Integer and String
        ArrayList arr=new ArrayList<>();
        arr.add(1);
        arr.add("Rohit");
        arr.add("Kumar");
        System.out.println(arr);
    }
}