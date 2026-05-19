public class SimpleHeart {
    public static void main(String[] args) {

        for (int y = 15; y >= -15; y--) {
            for (int x = -30; x < 30; x++) {

                double xf = x * 0.05;
                double yf = y * 0.1;

                double formula = Math.pow(xf * xf + yf * yf - 1, 3)
                               - xf * xf * Math.pow(yf, 3);

                if (formula <= 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

