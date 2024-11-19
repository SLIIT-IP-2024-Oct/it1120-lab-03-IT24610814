import java.util.Scanner;
public class IT24610814Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();
        System.out.print("Enter the number of OT hours: ");
        int otHours = input.nextInt();
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = input.nextDouble();

        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;
        System.out.printf("The total salary including OT amount is: %.2f%n", totalSalary);
        input.close();
    }
}