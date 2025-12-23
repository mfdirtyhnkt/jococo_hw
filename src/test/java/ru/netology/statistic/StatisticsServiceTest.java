package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_singleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long actual = service.findMax(incomes);
        Assertions.assertEquals(42, actual);
    }

    @Test
    void findMax_allSameValues() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5};
        long actual = service.findMax(incomes);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void findMax_negativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-10, -5, -20, -1};
        long actual = service.findMax(incomes);
        Assertions.assertEquals(-1, actual);
    }

}
