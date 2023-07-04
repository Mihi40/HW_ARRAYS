package ru.netology.qa.Javaqamvn3.Starts;

public class StatsService {
    public int SalesAmount(int[] months) {
        int sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum = sum + months[i];
        }
        return sum;
    }
    public int SalesAvg(int[] months) {
        int sum = 0;
        int sumAvg;
        for (int i = 0; i < months.length; i++) {
            sum = sum + months[i];
        }
        sumAvg = sum / months.length;
        return sumAvg;
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth+1;
    }
    public int minSales(int [] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int SalesBelowAver(int [] sales) {
        StatsService StatsService = new StatsService();
        int actualSumAvg = StatsService.SalesAvg(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < actualSumAvg) {
                countMonth += 1;
            }
        }
        return countMonth;
    }
    public int SalesAboveAver(int [] sales) {
        StatsService StatsService = new StatsService();
        int actualSumAvg = StatsService.SalesAvg(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > actualSumAvg) {
                countMonth += 1;
            }
        }
        return countMonth;
    }
}
