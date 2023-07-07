package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfZero() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 0, 3, 8, 6, 11, 11, 12};


        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfNeg() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, -2, 3, 8, 6, 11, 11, 12};


        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfAbout() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 13, 3, 8, 6, 11, 11, 12};


        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfVeryBig() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 123456789, 8, 4, 13, 3, 8, 6, 11, 11, 12};


        long expected = 123456789;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
