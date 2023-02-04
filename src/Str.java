import java.util.function.Function;
import java.util.function.Predicate;

public class Str {
    static void check(String str) {
        Predicate<String> predicate = s ->
                (str.toLowerCase().charAt(0) == 'a' || str.toLowerCase().charAt(0) == 'b')
                        && str.toLowerCase().charAt(str.length() - 1) == 'z';
        System.out.println(predicate.test(str));
    }

    public static <T, U> Function<T, U> ternary(Function<? super T, ? extends U> function) {
        return function::apply;
    }

    public static void main(String[] args) {
        int x = ternary(Integer::intValue).apply(10);
        System.out.println(x);

    }
}
