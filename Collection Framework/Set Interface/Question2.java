import java.util.HashSet;
public class Question2 {
    public static void main(String[] args){
        HashSet<Integer>ans=new HashSet<>();

        ans.add(4);
        ans.add(7);
        ans.add(8);

        System.out.println(ans);

        for(int i=1; i<=10; i++){
            if(ans.contains(i)){
                System.out.println(i +" Was Present in Set");
            }
            else{
                System.out.println(i +" Was Not Present in Set");
            }
        }
    }
}
