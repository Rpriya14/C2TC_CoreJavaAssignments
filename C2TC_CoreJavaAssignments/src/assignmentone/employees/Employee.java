package assignmentone.employees;

public class Employee {
    private String name;
    private String employeeId;
    private double salary;
    protected String department;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = "General";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    protected String getDepartment() { return department; }
    protected void setDepartment(String department) { this.department = department; }

    public String getDetails() {
        return "Name: " + name + ", ID: " + employeeId +
               ", Dept: " + department + ", Salary: " + salary;
    }
}