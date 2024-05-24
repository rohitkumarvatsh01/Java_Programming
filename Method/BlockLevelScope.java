public class BlockLevelScope{
    int demo(){
        int a=5;
        System.out.println(a);
        {
            int b=10; // ye sirf { } me b accessable hoga
            System.out.println(b);
            return b;
        }
    }
    public static void main(String[] args) {
        BlockLevelScope obj = new BlockLevelScope();

        System.out.println(obj.demo());
    }
}