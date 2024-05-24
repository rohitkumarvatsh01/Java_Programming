import java.util.ArrayList;
public class ReverseArrayList {

    public static void reverseArrayList(ArrayList<Integer>list){
        int i=0;
        int j=list.size()-1;

        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

    
    }
    public static void main(String[] args){
        ArrayList<Integer>ans=new ArrayList<>();

        ans.add(0);
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);

        System.out.println(ans);

        reverseArrayList();

    }
}
