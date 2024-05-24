import java.util.LinkedHashSet;
public class LinkedHashSetImplementation {
    public static void main(String[] args){

        //Implementation of LinkedHashSet
        LinkedHashSet<Integer>ans=new LinkedHashSet<>();

        //Add Element in LinkedHashSet
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);

        //Print Element in LinkedHashSet
        System.out.println(ans);

        //To Find the Size of LinkedHashSet
        System.out.println(ans.size());

        //To Check Element Present in LinkedHashSet
        System.out.println(ans.contains(3));

        //To Check LinkedHashSet is Empty or Not
        System.out.println(ans.isEmpty());

        //To Remove the Element in LinkedHashSet
        ans.remove(2);
        System.out.println(ans);

        //Print Element Using For Loop
        for(int i:ans){
            System.out.print(i+" ");
        }

        //To Remove all Element in LinkedHashSet
        ans.clear();
        System.out.println(ans);
    }
}
