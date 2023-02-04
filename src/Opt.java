import java.util.Objects;
import java.util.function.Predicate;

public class Opt {
    static boolean test;

    public static void main(String[] args) {
        Print pt = System.out::println;
        pt.test(2.3);

        Predicate<String> predicate = Objects::nonNull;
        test = predicate.and(String::isBlank).test(null);
        System.out.println(test);


    }
}
