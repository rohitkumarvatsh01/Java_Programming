import java.util.HashMap;
import java.util.Map;
public class First_element_to_occur_k_times {
    public static void main(String[] args){

        int N = 7;
        int K = 2;
        int A[] = {1, 7, 4, 3, 4, 8, 7};
        
        HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();

        for(int i=0; i<N; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }

            if(K==map.get(A[i])){
                System.out.println("Element is Present K times:- "+A[i]);
                break;
            }
        }

        System.out.println("Element in Not Present in HashMap");

    }
}
