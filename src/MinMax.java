import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.collect(Collectors.toList());

        T min = list.stream().min(order).orElse(null);
        T max = list.stream().max(order).orElse(null);

        minMaxConsumer.accept(min, max);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 6, 4, 15, 3, 2));
        findMinMax(list.stream(), Comparator.naturalOrder(), (a, b) ->
                System.out.println("min--> " + a + " max--> " + b));

    }
}
