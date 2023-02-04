import java.util.function.Predicate;

public class Str {
    static void check(String str) {
        Predicate<String> predicate = s ->
                (str.charAt(0) == 'a' || str.charAt(0) == 'b') && str.charAt(str.length() - 1) == 'z';
        System.out.println(predicate.test(str));
    }

    public static void main(String[] args) {

        int x = 10;
        if (x == (20 | 10)) {
            System.out.println("!!!!!");
        }
        check("bdkblsbz");
    }
}
