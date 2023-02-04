import java.util.List;

import static java.util.Arrays.stream;

public class BiNar {

    static void num(Integer... num) {
        List<Integer> list = stream(num).filter(x -> x % 2 == 0).toList();
        System.out.println(list + "\nВсего четных элементов: " + list.size());
    }

    public static void main(String[] args) {
        num(1, 3, 5, 4, 5, 6);
    }
}
