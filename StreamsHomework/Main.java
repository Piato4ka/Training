import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, -5, 4, 2, 2, 6, 7, 12, -3};

        double average = (IntStream.of(array).reduce(0, (x, y) -> x + y)) / (double) array.length;
        System.out.println(average);

        int min = IntStream.of(array).reduce((a, b) -> {
            return (a < b) ? a : b;
        }).getAsInt();

        long coutEqualsZero = IntStream.of(array).filter(x -> x == 0).count();

        System.out.print(coutEqualsZero);

        long largerZero = IntStream.of(array).filter(x -> x > 0).count();
        System.out.print(largerZero);

        // multiplication on 4
        IntStream.of(array).map(x -> x * 4).forEach(System.out::println);
    }
}