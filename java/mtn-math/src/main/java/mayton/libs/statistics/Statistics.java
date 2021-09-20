package mayton.libs.statistics;

import mayton.libs.Utils;

import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Statistics {

    public static Double mean(Iterator<Double> doubleIterator) {
        double sum = 0.0;
        int cnt = 0;
        while (doubleIterator.hasNext()) {
            sum += doubleIterator.next();
            cnt++;
        }
        if (cnt == 0) throw new IllegalArgumentException("");
        return sum / cnt;
    }

    /**
     * Дисперсией случайной величины называют математическое ожидание квадрата отклонения случайной величины от её математического ожидания.
     * @param doubleIterator
     * @return
     */
    public static Double dispersion(Iterator<Double> doubleIterator) {
        double mean = mean(doubleIterator);

        Iterator<Double> squareIterator = Utils.toStream(doubleIterator)
                .map(x -> x * x)
                .peek(x -> System.out.println(x)
                ).iterator();

        return mean(squareIterator) - (mean * mean);
    }

    /**
     * Квадратный корень из дисперсии, равный σ,
     * называется среднеквадратическим отклонением, стандартным отклонением или стандартным разбросом.
     * @param numbers
     * @return
     */
    public static Double standardDeviation(Iterator<Double> numbers) {
        return Math.sqrt(dispersion(numbers));
    }



}
