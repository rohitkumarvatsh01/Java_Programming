public class FloydsTriangleCountCharacter {
    public static void main(String[] args){
        char count='A';
        for(char i='A'; i<='E'; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
