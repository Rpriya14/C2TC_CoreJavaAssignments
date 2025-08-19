package assignmenttwo;

import assignmenttwo.student.Student;
import assignmenttwo.commission.Commission;

public class AssignmentTwoMain {
    public static void main(String[] args) {
        // Part 1: Student default constructor
        Student s1 = new Student();

        // Part 2: Commission class
        Commission emp = new Commission();
        emp.acceptDetails();       // accept input
        emp.calculateCommission(); // calculate and display commission
    }
}
