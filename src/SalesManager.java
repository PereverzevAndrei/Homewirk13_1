public class SalesManager {
    protected static int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public static int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public static int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public static int AverageSale(int[] sales) {
        int salesSumm = 0;
        for (int sale : sales) {
            salesSumm += sale;
        }
        System.out.println("Average Sale: " + (salesSumm - min() - max()) / (sales.length - 2));
        return salesSumm;
    }
}
