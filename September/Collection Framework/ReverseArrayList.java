import java.util.ArrayList;
public class ReverseArrayList {

    public static void main(String[] args){
        ArrayList<Integer>ans=new ArrayList<>();

        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);

        System.out.println(ans);

        int i=0;
        int j=ans.size()-1;

        while(i<j){
            Integer temp=Integer.valueOf(ans.get(i));
            ans.set(i, ans.get(j));
            ans.set(j, temp);

            i++;
            j--;
        }
        
        System.out.println(ans);
    }
}