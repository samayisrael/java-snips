import java.util.Scanner;

public class Salary {
    public static double calculateSalary(double hoursPerWeek, double hourlyRate) {
      double result = hoursPerWeek * hourlyRate * 52;
      return result;
    }
    public static void main(String[] args) {

      double employeeYearlySalary = calculateSalary(79, 10.00);
      System.out.println("Employees Yearly Salary is "+employeeYearlySalary);

    }
}
