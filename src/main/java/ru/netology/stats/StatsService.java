package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }
        }
        return maxMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int result = 0;
        long average = average (sales);
        for (long sale : sales) {
            if (sale < average) {
                result++;

            }
        }
        return result;

    }

    public int monthsUnderAverage(long[] sales) {
        int result = 0;
        long average = average (sales);
        for (long sale : sales) {
            if (sale > average) {
                result++;

            }
        }
        return result;
    }
}