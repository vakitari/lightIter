public class Main {
    public static void main(String[] args) {
        double x1 = 0, x2 = 0, x3 = 0, x4 = 0;
        double e = 0.0001;
        int i = 0;

        while (true) {
            double temp1 = x1;
            double temp2 = x2;
            double temp3 = x3;
            double temp4 = x4;

            x1 = (1.27 - 0.14 * x2 + 0.06 * x3 - 0.16 * x4) / 3;
            x2 = (-0.78 - 0.12 * x1 + 0.18 * x3 - 0.18 * x4) / 4;
            x3 = (-0.58 - 0.08 * x1 + 0.12 * x2 + 0.23 * x4 + 1.51) / 5;
            x4 = (1.51 - 0.25 * x1 - 0.21 * x2 - 0.19 * x3) / 6;

            if (Math.abs(temp1 - x1) < e && Math.abs(temp2 - x2) < e && Math.abs(temp3 - x3) < e && Math.abs(temp4 - x4) < e) {
                break;
            }

            i++;
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
        System.out.println("Number of iterations = " + i);
    }
}