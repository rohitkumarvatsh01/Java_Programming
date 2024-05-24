import java.util.LinkedList;
public class LinkedListImplemenation {
    public static void main(String[] args){

        //Decelration of LinkedList
        LinkedList<Integer>ans=new LinkedList<>();

        //Add Element in LinkedList
        ans.add(1);
        ans.add(2);
        ans.add(3);

        //Top Element in LinkedList
        System.out.println(ans.peek());

        //Remove Elemnent in LinkedList
        System.out.println(ans.poll());

        //Top Element in LinkedList
        System.out.println(ans.peek());

        //To check LinkedList is Empty or Not
        System.out.println(ans.isEmpty());

        //To Find the Size of LinkedList
        System.out.println("Size of LinkedList:- "+ans.size());

        //Print the All Element in LinkedList
        System.out.println(ans);
    
    }
}

