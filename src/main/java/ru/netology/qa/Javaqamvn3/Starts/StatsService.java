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
        return SalesAmount(months) / months.length;
    }

    public int maxSales(int[] sales) {
        int maxmonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxmonth]) {
                maxmonth = i;
            }
        }
        return maxmonth + 1;
    }

    public int minSales(int[] sales) {
        int minmonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minmonth]) {
                minmonth = i;
            }
        }
        return minmonth + 1;
    }

    public int SalesBelowAver(int[] sales) {
        int actualsumavg = SalesAvg(sales);
        int countmonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < actualsumavg) {
                countmonth += 1;
            }
        }
        return countmonth;
    }

    public int SalesAboveAver(int[] sales) {
        int actualsumavg = SalesAvg(sales);
        int countmonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > actualsumavg) {
                countmonth += 1;
            }
        }
        return countmonth;
    }
}
