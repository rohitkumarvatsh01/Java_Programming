import java.util.HashSet;
public class HashSetImplemenatation {
    public static void main(String[] args){

        //Implementation Of HashSet
        HashSet<Integer>ans=new HashSet<>();

        //Add Element in HashSet
        ans.add(1);
        ans.add(12);
        ans.add(9);
        ans.add(4);
        ans.add(5);
        ans.add(11);
        ans.add(2);

        //Print the All Element in HashSet
        System.out.println(ans);

        ans.add(1);
        System.out.println(ans);

        //Check the Size of HashSet
        System.out.println(ans.size());

        //Check the HashSet is Empty
        System.out.println(ans.isEmpty());

        //To Remove the Element in HashSet
        System.out.println(ans.remove(2));
        System.out.println(ans);

        //To Check Element Present in HashSet
        System.out.println(ans.contains(3));

        //Print Element Using HashSet
        for(int i:ans){
            System.out.print(i+" ");
        }

        //To Remove all Element in HashSet
        ans.clear();
        System.out.println(ans);

    }
}