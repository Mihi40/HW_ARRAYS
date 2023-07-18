package ru.netology.qa.Javaqamvn3.Starts;

public class StatsService {
    public int salesAmount(int[] months) {
        int sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum = sum + months[i];
        }
        return sum;
    }

    public int salesAvg(int[] months) {
        return salesAmount(months) / months.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAver(int[] sales) {
        int actualSumAvg = salesAvg(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < actualSumAvg) {
                countMonth += 1;
            }
        }
        return countMonth;
    }

    public int salesAboveAver(int[] sales) {
        int actualSumAvg = salesAvg(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > actualSumAvg) {
                countMonth += 1;
            }
        }
        return countMonth;
    }
}
