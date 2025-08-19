package assignmentone;

import assignmentone.employees.*;
import assignmentone.utilities.EmployeeUtilities;
import java.util.Arrays;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Priya", "M001", 90000, 10);
        Developer dev = new Developer("Ravi", "D101", 55000,
                Arrays.asList("Java", "Python"), "Junior");

        System.out.println("=== Before Raise ===");
        EmployeeUtilities.printDetails(mgr);
        EmployeeUtilities.printDetails(dev);

        EmployeeUtilities.giveRaise(mgr, 10);
        EmployeeUtilities.giveRaise(dev, 15);

        System.out.println("\n=== After Raise ===");
        EmployeeUtilities.printDetails(mgr);
        System.out.println("Annual: " + EmployeeUtilities.calculateAnnualSalary(mgr));
        EmployeeUtilities.printDetails(dev);
        System.out.println("Annual: " + EmployeeUtilities.calculateAnnualSalary(dev));

        System.out.println("\nRole Specific Info:");
        EmployeeUtilities.roleInfo(mgr);
        EmployeeUtilities.roleInfo(dev);
    }
}