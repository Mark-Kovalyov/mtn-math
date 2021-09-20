package mayton.libs;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Utils {

    public static <T> Stream<T> toStream(Iterator<T> iterator) {
        Iterable<T> iterable = () -> iterator;
        return StreamSupport.stream(iterable.spliterator(), false);
    }

}
