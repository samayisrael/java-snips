

public class Main {
    public static void main(String[] args) {

       Student studentA = new Student("Samay", "Israel", 4.0, 2020, "Computer Science");
       Student studentB = new Student("Daniel", "Strauss", 3.9, 2019, "AI and Robotics");
       System.out.println(studentA.firstName+"'s major is "+studentA.major+" "+studentA.gradYear);
       System.out.println(studentB.firstName+"'s major is "+studentB.major+" "+studentB.gradYear);

       studentA.incrementGradYear();
       System.out.println("New Grad Year for "+studentA.firstName+" is "+studentA.gradYear);
       System.out.println(Student.missionStatement);

    }
}
