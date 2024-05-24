import java.util.HashSet;
public class Question1 {
    public static void main(String[] args){
        HashSet<String>ans=new HashSet<>();

        ans.add("Rohit");
        ans.add("Kumar");
        ans.add("Singh");
        ans.add("Siwan");
        ans.add("Bihar");

        System.out.println(ans);

        if(ans.contains("Kumari")){
            System.out.println("Element Present in HashSet");
        }
        else{
            System.out.println("Element Not Present");
        }

    }
}
