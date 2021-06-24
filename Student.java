public class Student {

    static String missionStatement = "Yay for learning!";
    String firstName;
    String lastName;
    double studentGPA;
    int gradYear;
    String major;

    public Student(String firstName, String lastName,
                    double studentGPA, int gradYear,
                    String major) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.studentGPA = studentGPA;
        this.gradYear = gradYear;
        this.major = major;
    }
    public int incrementGradYear() {
        return this.gradYear++;

    }


}
