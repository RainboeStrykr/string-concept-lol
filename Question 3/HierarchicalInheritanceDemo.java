import java.util.Date;

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        
        employees[0] = new Developer("D101", "Alice", 5000, "IT", new Date(),
                                     new String[]{"Java", "Python"}, "Senior", 12);
        employees[1] = new Manager("M201", "Bob", 7000, "HR", new Date(),
                                   10, "Manager", 50000);
        employees[2] = new Intern("I301", "Charlie", 1500, "IT", new Date(),
                                  "ABC University", 12, "D101", false);

        System.out.println("\n--- Polymorphic Method Calls ---");
        for (Employee e : employees) {
            e.printEmployeeDetails();
            System.out.println("Job: " + e.getJobDescription());
            System.out.println("Salary: " + e.calculateSalary());
            e.performWork();
            e.attendMeeting();
            e.takeBreak();
            System.out.println();
        }

        System.out.println("--- Type Checking with instanceof ---");
        for (Employee e : employees) {
            if (e instanceof Developer) {
                ((Developer) e).writeCode("Java");
            } else if (e instanceof Manager) {
                ((Manager) e).assignTasks();
            } else if (e instanceof Intern) {
                ((Intern) e).attendTraining();
            }
        }
    }
}