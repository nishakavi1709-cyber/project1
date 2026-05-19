public class HeartPattern {
    public static void main(String[] args) {

        String chars = "happy";  // characters to cycle through

        for (int y = 15; y >= -15; y--) {
            StringBuilder line = new StringBuilder();

            for (int x = -30; x < 30; x++) {
                double xf = x * 0.05;
                double yf = y * 0.1;

                double formula = Math.pow(xf * xf + yf * yf - 1, 3)
                               - xf * xf * Math.pow(yf, 3);

                if (formula <= 0) {
                    // choose character based on (x - y) % 8 just like Python
                    int index = Math.floorMod((x - y), 8) % chars.length();
                    line.append(chars.charAt(index));
                } else {
                    line.append(" ");
                }
            }

            System.out.println(line);
        }
    }
}
