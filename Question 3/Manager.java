import java.util.Date;
public class Manager extends Employee {
    private int teamSize;
    private String managementLevel; // Team Lead/Manager/Director
    public Manager(String employeeId, String name, double baseSalary, String department, Date joiningDate,
                   int teamSize, String managementLevel, double budgetResponsibility) {
        super(employeeId, name, baseSalary, department, joiningDate);
        this.teamSize = teamSize;
        this.managementLevel = managementLevel;
        System.out.println("Manager profile created");
    }

    @Override
    public double calculateSalary() {
        double bonus = teamSize * 100;
        if ("Director".equalsIgnoreCase(managementLevel)) {
            bonus += 5000;
        } else if ("Manager".equalsIgnoreCase(managementLevel)) {
            bonus += 3000;
        }
        return baseSalary + bonus;
    }

    @Override
    public String getJobDescription() {
        return "Team Manager";
    }

    @Override
    public void performWork() {
        System.out.println(name + " is coordinating team activities");
    }

    @Override
    public void attendMeeting() {
        System.out.println(name + " is leading a strategic meeting");
    }

    public void conductPerformanceReview() {
        System.out.println(name + " is conducting team performance review");
    }

    public void assignTasks() {
        System.out.println(name + " is assigning tasks to team members");
    }

    public void manageBudget() {
        System.out.println(name + " is managing department budget");
    }
}
