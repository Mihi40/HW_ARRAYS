package ru.netology.qa.Javaqamvn3.Starts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalcSalesAmount() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //сумма всех продаж
        int expectedsum = 180;
        int actualsum = StatsService.SalesAmount(arr);
        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    public void shouldCalcSumAver() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //средняя сумма всех продаж в месяц
        int expectedsumavg = 15;
        int actualsumavg = StatsService.SalesAvg(arr);
        Assertions.assertEquals(expectedsumavg, actualsumavg);
    }

    @Test
    public void shouldCalcMaxMonths() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int expectedmaxmonths = 8;
        int actualmaxmonths = StatsService.maxSales(arr);
        Assertions.assertEquals(expectedmaxmonths, actualmaxmonths);
    }

    @Test
    public void shouldCalcMinMoths() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int expectedminsales = 9;
        int actualminsales = StatsService.minSales(arr);
        Assertions.assertEquals(expectedminsales, actualminsales);
    }

    @Test
    public void shouldCalcMothsBelowAver() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //количество месяцев, в которых продажи были ниже среднего
        int expectedsalesbelowAver = 5;
        int actualsalesbelowaver = StatsService.SalesBelowAver(arr);
        Assertions.assertEquals(expectedsalesbelowAver, actualsalesbelowaver);
    }

    @Test
    public void shouldCalcMothsAboveAver() {
        StatsService StatsService = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //количество месяцев, в которых продажи были выше среднего
        int expectedsalesaboveaver = 5;
        int actualsalesaboveaver = StatsService.SalesAboveAver(arr);
        Assertions.assertEquals(expectedsalesaboveaver, actualsalesaboveaver);
    }
}