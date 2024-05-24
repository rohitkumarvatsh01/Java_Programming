import java.util.ArrayList;
public class ArrayListMethod {
    public static void main(String[] args){
        ArrayList<Integer>ans=new ArrayList<Integer>();

        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        System.out.println(ans);

        System.out.println(ans.get(0));

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }

        System.out.println();

        ans.add(2,9);
        System.out.println(ans);

        ans.set(1,10);
        System.out.println(ans);

        ans.remove(2);
        System.out.println(ans);

        ans.remove(Integer.valueOf(3));
        System.out.println(ans);

        boolean check=ans.contains(Integer.valueOf(10));
        System.out.println(check);
    }
}
