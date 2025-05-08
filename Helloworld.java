import java.util.*;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("hello Taglia");

        Vector<Character> lettere = new Vector<Character>();
        lettere.add('T');
        lettere.add('A');
        lettere.add('G');
        lettere.add('L');
        lettere.add('I');
        lettere.add('A');
        for (Character lettera : lettere) {
            System.out.println(lettera);
        }
}
