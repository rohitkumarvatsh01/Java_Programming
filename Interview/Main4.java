import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Object> input = new ArrayList<>();
        input.add('a');
        input.add(14);
        input.add('x');
        input.add(-1);
        input.add(2);
        input.add(5);
        input.add(11);
        input.add(9);
        input.add(-12);
        input.add(4);
        input.add(7);
        input.add(6);
        input.add(-3);
        input.add('I');

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        HashSet<Character> characterSet = new HashSet<>();

        for (Object obj : input) {
            if (obj instanceof Integer) {
                int number = (int) obj;
                if (number % 2 == 1) {
                    oddNumbers.add(number);
                } else {
                    evenNumbers.add(number);
                }
            } else if (obj instanceof Character) {
                characterSet.add((Character) obj);
            }
        }

        Collections.sort(oddNumbers);
        oddNumbers.addAll(evenNumbers);

        StringBuilderMethod sb = new StringBuilderMethod();
        for (Character c : characterSet) {
            sb.append(c);
        }

        String palindrome = sb.toString();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (sb.lastIndexOf(Character.toString(c)) != i) {
                palindrome = palindrome.replace(Character.toString(c), "");
            }
        }

        System.out.println(oddNumbers);
        System.out.println(palindrome);
    }
}
