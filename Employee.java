public class Employee {

    static String missionStatement = "Yay for learning!";
    String name;
    int age;
    int salary;
    String location;


    public Employee(String name, int age,
                    int salary, String location) {

        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }
    void raiseSalary(int raiseAmount) {
        this.salary = this.salary + raiseAmount;

    }


}
