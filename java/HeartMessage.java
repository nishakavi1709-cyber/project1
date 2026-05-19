public class HeartMessage {
    public static void main(String[] args) {
        String message = "Good Morning";

        for (int y = 15; y >= -15; y--) {
            StringBuilder line = new StringBuilder();

            for (int x = -30; x < 30; x++) {
                double xf = x * 0.05;
                double yf = y * 0.1;

                double formula = Math.pow(xf * xf + yf * yf - 1, 3)
                               - xf * xf * Math.pow(yf, 3);

                if (formula <= 0) {
                    line.append("*");
                } else {
                    line.append(" ");
                }
            }

            // Insert message on row y == 2
            if (y == 2) {
                int mid = line.length() / 2;
                int start = mid - message.length() / 2;

                for (int i = 0; i < message.length(); i++) {
                    line.setCharAt(start + i, message.charAt(i));
                }
            }

            System.out.println(line.toString());
        }
    }
}
