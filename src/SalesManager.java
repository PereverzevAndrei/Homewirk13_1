public class SalesManager {
    protected long[] sales;
    public long max;
    public long min;
    public long salesSumm;

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

    public long averageSale(long[] sales) {
        long salesSumm = 0;
        max(sales.length);
        min();
        for (long sale : sales) {
            salesSumm += sale;
        }
        System.out.println("Average Sale: " + (salesSumm - min - max) / (sales.length - 2));
        return salesSumm;
    }
}
