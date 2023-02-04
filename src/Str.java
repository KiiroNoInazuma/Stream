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
            Predicate<? super T> predicateZero,
            Function<? super T, ? extends U> plus,
            Function<? super T, ? extends U> minus,
            Function<? super T, ? extends U> zero) {

        return t -> predicate.test(t) ? plus.apply(t) : (predicateZero.test(t) ? zero.apply(t) : minus.apply(t));
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 0;
        Predicate<Integer> predicateZero = x -> x == 0;
        Function<Integer, String> fun = x -> "положительное число";
        Function<Integer, String> funny = x -> "отрицательное число";
        Function<Integer, String> zero = x -> "ноль";
        String str = ternary(predicate, predicateZero, fun, funny, zero).apply(0);
        System.out.println(str);
    }
}
