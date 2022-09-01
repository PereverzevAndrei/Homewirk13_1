public class SalesManager {
    protected long[] sales;
    protected static long max;
    protected static long min;
    public SalesManager(long[] sales) {
        this.sales = sales;
    }
    public long max(int i) {
        long max = -1;
        for (long sale : sales) {

            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = max;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public static long averageSale(long[] sales) {
        long salesSumm = 0;
        for (long sale : sales) {
            salesSumm += sale;
        }
        System.out.println("Average Sale: " + (salesSumm - min - max) / (sales.length - 2));
        return salesSumm;
    }
}
