package ru.netology.qa.Javaqamvn3.Starts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalcSalesAmount() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //сумма всех продаж
        int expectedSum = 180;
        int actualSum = StatsService.salesAmount(arr);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalcSumAver() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //средняя сумма всех продаж в месяц
        int expectedSumAvg = 15;
        int actualSumAvg = StatsService.salesAvg(arr);
        Assertions.assertEquals(expectedSumAvg, actualSumAvg);
    }

    @Test
    public void shouldCalcMaxMonths() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int expectedMaxMonths = 8;
        int actualMaxMonths = StatsService.maxSales(arr);
        Assertions.assertEquals(expectedMaxMonths, actualMaxMonths);
    }

    @Test
    public void shouldCalcMinMoths() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int expectedMinSales = 9;
        int actualMinSales = StatsService.minSales(arr);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldCalcMothsBelowAver() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //количество месяцев, в которых продажи были ниже среднего
        int expectedSalesBelowAver = 5;
        int actualSalesBelowAver = StatsService.salesBelowAver(arr);
        Assertions.assertEquals(expectedSalesBelowAver, actualSalesBelowAver);
    }

    @Test
    public void shouldCalcMothsAboveAver() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //количество месяцев, в которых продажи были выше среднего
        int expectedSalesAboveAver = 5;
        int actualSalesAboveAver = StatsService.salesAboveAver(arr);
        Assertions.assertEquals(expectedSalesAboveAver, actualSalesAboveAver);
    }
}