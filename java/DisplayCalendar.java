import java.util.Scanner;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month - 1, 1); 

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        
        System.out.println("\n     " + cal.getDisplayName(java.util.Calendar.MONTH, java.util.Calendar.LONG, java.util.Locale.ENGLISH) 
                           + " " + year);
        for (String day : days) {
            System.out.print(day + " ");
        }
        System.out.println();

        int firstDayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

        
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
