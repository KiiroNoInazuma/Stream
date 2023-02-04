import java.util.function.Function;
import java.util.function.Predicate;

public class Str {
    static void check(String str) {
        Predicate<String> predicate = s ->
                (str.toLowerCase().charAt(0) == 'a' || str.toLowerCase().charAt(0) == 'b')
                        && str.toLowerCase().charAt(str.length() - 1) == 'z';
        System.out.println(predicate.test(str));
    }

    public static <T, U> Function<T, U> ternary(
            Predicate<? super T> predicate,
            Function<? super T, ? extends U> plus,
            Function<? super T, ? extends U> minus) {
        return t -> predicate.test(t) ? plus.apply(t) : minus.apply(t);
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 0;
        Function<Integer, String> fun = x -> "положительное";
        Function<Integer, String> funny = x -> "отрицательное";
        String str = ternary(predicate, fun, funny).apply(-10);
        System.out.println(str);
    }
}
