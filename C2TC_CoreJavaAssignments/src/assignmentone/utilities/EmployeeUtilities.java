package assignmentone.utilities;

import assignmentone.employees.*;

public class EmployeeUtilities {
    public static void printDetails(Employee e) {
        System.out.println(e.getDetails());
    }

    public static void giveRaise(Employee e, double percent) {
        double newSal = e.getSalary() + (e.getSalary() * percent / 100);
        e.setSalary(newSal);
    }

    public static double calculateAnnualSalary(Employee e) {
        return e.getSalary() * 12;
    }

    public static void roleInfo(Employee e) {
        if (e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println("Manager team size: " + m.getTeamSize());
        } else if (e instanceof Developer) {
            Developer d = (Developer) e;
            System.out.println("Developer level: " + d.getLevel());
            System.out.println("Languages: " + d.getProgrammingLanguages());
        }
    }
}