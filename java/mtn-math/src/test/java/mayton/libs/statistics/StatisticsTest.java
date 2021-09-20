package mayton.libs.statistics;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    private static final double EPSILON = 0.01;

    private static List<Double> list = Arrays.asList(2.0, 3.0, 5.0);

    @Disabled
    @Test
    void testMean() {
        assertEquals(3.33, Statistics.mean(list.iterator()), EPSILON);
    }

    @Test
    void testDispersion() {
        assertEquals(3.33, Statistics.dispersion(list.iterator()), EPSILON);
    }

}