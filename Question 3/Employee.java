import java.util.Date;

public class Employee {
    protected String employeeId;
    protected String name;
    protected double baseSalary;
    protected String department;
    protected Date joiningDate;

    public Employee(String employeeId, String name, double baseSalary, String department, Date joiningDate) {
        if (employeeId == null || name == null || department == null) {
            throw new IllegalArgumentException("Invalid employee details");
        }
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
        this.joiningDate = joiningDate;
        System.out.println("Employee " + name + " created in " + department);
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public String getJobDescription() {
        return "General Employee";
    }

    public void performWork() {
        System.out.println("Employee is working");
    }

    public void attendMeeting() {
        System.out.println("Employee attending meeting");
    }

    public final String getEmployeeId() {
        return employeeId;
    }

    public final void printEmployeeDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name +
                ", Department: " + department + ", Base Salary: " + baseSalary +
                ", Joining Date: " + joiningDate);
    }

    public void takeBreak() {
        System.out.println(name + " is taking a short break.");
    }

    public void clockIn() {
        System.out.println(name + " clocked in.");
    }

    public void clockOut() {
        System.out.println(name + " clocked out.");
    }
}
