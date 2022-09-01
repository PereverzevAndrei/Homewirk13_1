public class Main {
    public static void main(String[] args) {
        long[] sls = {700, 400, 11, 1000, 1200};
        SalesManager sM = new SalesManager(sls);

        System.out.println(sM.max(5));
    }
}