import java.util.Scanner;

public class IT23709348Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter exam marks (out of 100): ");
        double exam = sc.nextDouble();
        System.out.print("Enter lab submission marks (out of 100): ");
        double lab = sc.nextDouble();

        if (exam < 0 || exam > 100 || lab < 0 || lab > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter percentage taken from exam marks: ");
        double examPct = sc.nextDouble();
        System.out.print("Enter percentage taken from lab submission marks: ");
        double labPct = sc.nextDouble();

        if (examPct + labPct != 100) {
            System.out.println("Invalid percentages! They should add up to 100.");
            return;
        }

        double finalMark = exam * examPct / 100 + lab * labPct / 100;
        System.out.println("Final Mark: " + finalMark);
    }
}
