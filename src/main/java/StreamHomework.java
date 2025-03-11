import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamHomework {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        List<String> result = languages.stream()
                .filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number > 30));

        // Сортировка каждой группы
        List<Integer> lessThanOrEqual30 = partitionedNumbers.get(false).stream()
                .sorted()
                .toList();

        List<Integer> greaterThan30 = partitionedNumbers.get(true).stream()
                .sorted()
                .toList();

        // Вывод результата
        System.out.println("Numbers <= 30 (sorted): " + lessThanOrEqual30);
        System.out.println("Numbers > 30 (sorted): " + greaterThan30);
    }
}
