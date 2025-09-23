// File: Intern.java
import java.util.Date;

public class Intern extends Employee {
    private String mentor;
    public Intern(String employeeId, String name, double stipend, String department, Date joiningDate,
                  String university, int internshipDuration, String mentor, boolean isFullTime) {
        super(employeeId, name, stipend, department, joiningDate);
        this.mentor = mentor;
        System.out.println("Intern onboarded");
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // stipend only
    }

    @Override
    public String getJobDescription() {
        return "Intern";
    }

    @Override
    public void performWork() {
        System.out.println(name + " is learning and assisting");
    }

    public void attendTraining() {
        System.out.println(name + " is attending training session");
    }

    public void submitReport() {
        System.out.println(name + " is submitting weekly progress report");
    }

    public void seekMentorship() {
        System.out.println(name + " is getting guidance from mentor " + mentor);
    }
}
