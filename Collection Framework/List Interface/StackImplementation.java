import java.util.Stack;
public class StackImplementation {
    public static void main(String[] args){
        
        //Stack Decleration
        Stack<Integer>ans=new Stack<>();

        //Push Element in Stack
        ans.push(1);
        ans.push(2);
        ans.push(3);
        ans.push(4);
        ans.push(5);

        //Print Stack
        System.out.println(ans);

        //To Find the Top Element in Stack
        System.out.println(ans.peek());

        //To Revome Top Element in Stack
        System.out.println(ans.pop());

        //To Find Size of Stack
        System.out.println(ans.size());

        //To check Stack is Empty or Not
        System.out.println(ans.empty());

        ans.push(6);
        System.out.println(ans);

        ans.pop();
        System.out.println(ans);

        ans.pop();
        ans.pop();
        ans.pop();
        System.out.println(ans.peek());

        ans.pop();
        System.out.println(ans);
        System.out.println(ans.size());
    }
}
