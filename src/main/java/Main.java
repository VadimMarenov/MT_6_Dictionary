import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * В данной программе используется Фунциональный интерфейс и монады (Stream API).
 */
public class Main {
    public static void main(String[] args) {
        String text = "Asdgdsfg Asdgdsfg zfpigh qwerwer lkenrterlkt dsckgnfdsgnd ewrtpoerte dsmgvxcmvb qweqwe";

        Function<String, List<String>> function = str -> Arrays.stream((str.split(" ")))
                .sorted()
                .distinct()
                .toList();

        function.apply(text).forEach(System.out::println);
    }
}
