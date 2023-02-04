import java.util.function.Predicate;

public class Opt {


    public static void main(String[] args) {
        Print pt = System.out::println;
        //pt.test(2.3);

        Predicate<String> predicate = s -> s != null && !s.isBlank();





    }
}
