public class Main {
    public static void main(String[] args) {

    Employee programmer = new Employee("Samay", 48, 100000, "Petaluma");
    Employee intern = new Employee("NewGrad", 23, 70000, "SF Bay Area");

    System.out.println(programmer.name+" starts out with "+programmer.salary+" a year");
    programmer.raiseSalary(20000);
    System.out.println(programmer.name+" now has a salary of "+programmer.salary+". Good Work!");
    System.out.println(intern.name+" has a salary of "+intern.salary+" because they are only here for the summer.");

    }
}
