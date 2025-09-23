import java.util.Date;

public class Developer extends Employee {
    private String experienceLevel;
    private int projectsCompleted;

    public Developer(String employeeId, String name, double baseSalary, String department, Date joiningDate,
                     String[] programmingLanguages, String experienceLevel, int projectsCompleted) {
        super(employeeId, name, baseSalary, department, joiningDate);
        this.experienceLevel = experienceLevel;
        this.projectsCompleted = projectsCompleted;
        System.out.println("Developer profile created");
    }

    @Override
    public double calculateSalary() {
        double bonus = projectsCompleted * 500;
        if ("Senior".equalsIgnoreCase(experienceLevel)) {
            bonus += 2000;
        } else if ("Mid".equalsIgnoreCase(experienceLevel)) {
            bonus += 1000;
        }
        return baseSalary + bonus;
    }

    @Override
    public String getJobDescription() {
        return "Software Developer";
    }

    @Override
    public void performWork() {
        System.out.println(name + " is coding and debugging");
    }

    @Override
    public void attendMeeting() {
        System.out.println(name + " is in a technical meeting");
    }

    public void writeCode(String language) {
        System.out.println(name + " is writing code in " + language);
    }

    public void reviewCode() {
        System.out.println(name + " is reviewing team's code");
    }

    public void deployApplication() {
        System.out.println(name + " is deploying application to production");
    }
}
