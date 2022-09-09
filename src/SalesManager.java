public class SalesManager {
    protected long[] sales;
    protected long max;
    protected long min;
    protected long salesSumm;
    protected long averageSale;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max(int i) {
        max = -1;
        for (long sale : sales) {

            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long averageSale() {
        long salesSumm = 0;
        long averageSale;
        max(sales.length);
        min();
        for (long sale : sales) {
            salesSumm += sale;
        }
        averageSale = (salesSumm - min - max) / (sales.length - 2);
        System.out.println("—редн€€ продажа: " + averageSale);
        return averageSale;
    }
}
