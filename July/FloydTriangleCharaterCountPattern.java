public class FloydTriangleCharaterCountPattern {
    public static void main(String[] args) {
        for(char ch=65; ch<=69; ch++){
            for(char j=65; j<=ch; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
