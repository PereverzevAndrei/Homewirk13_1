public class Main {
    public static void main(String[] args) {

        long[] sls = {700, 400, 11, 1000, 1200, 1890};

        SalesManager sM = new SalesManager(sls);
        sM.min();
        System.out.println(sM.min);
        sM.max(sls.length);
        System.out.println(sM.max);
        sM.averageSale();
    }
}