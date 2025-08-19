package assignmentone.employees;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
        this.department = "Management";
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Team Size: " + teamSize;
    }
}