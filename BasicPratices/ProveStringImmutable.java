public class ProveStringImmutable{
    public static void main(String[] args){
        String a="Rohit";
        String b=a;

        System.out.println(a);
        System.out.println(b);

        a="Sita";
        System.out.println(a);
        System.out.println(b);
    }
}