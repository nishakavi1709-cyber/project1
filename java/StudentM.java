import java.util.Scanner;

public class StudentM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String student1, student2;
        int s1m1, s1m2, s1m3;
        int s2m1, s2m2, s2m3;

        System.out.print("Enter Student 1 Name: ");
        student1 = sc.nextLine();

        System.out.print("Enter marks for " + student1 + " (3 subjects): ");
        s1m1 = sc.nextInt();
        s1m2 = sc.nextInt();
        s1m3 = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Student 2 Name: ");
        student2 = sc.nextLine();

        System.out.print("Enter marks for " + student2 + " (3 subjects): ");
        s2m1 = sc.nextInt();
        s2m2 = sc.nextInt();
        s2m3 = sc.nextInt();

        int total1 = s1m1 + s1m2 + s1m3;
        double avg1 = total1 / 3.0;

        int total2 = s2m1 + s2m2 + s2m3;
        double avg2 = total2 / 3.0;

        System.out.println("\n----- RESULTS -----");
        System.out.println(student1 + " Total: " + total1 + "  Average: " + avg1);
        System.out.println(student2 + " Total: " + total2 + "  Average: " + avg2);

        sc.close();
    }
}