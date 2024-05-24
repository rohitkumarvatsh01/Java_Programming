import java.util.TreeSet;
public class TreeSetImplementation {
    public static void main(String[] args){
        
        //Implementation Of TreeSet
        TreeSet<Integer>ans=new TreeSet<>();

        //Add Element in TreeSet
        ans.add(1);
        ans.add(3);
        ans.add(2);
        ans.add(5);
        ans.add(4);

        //Print Element in TreeSet
        System.out.println(ans);

        //Remove the Element in TreeSet
        ans.remove(2);
        System.out.println(ans);

        //To Find the Element Present or Not
        System.out.println(ans.contains(3));

        //Find the Size of TreeSet
        System.out.println(ans.size());

        //Print Element Using For Loop
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
}
