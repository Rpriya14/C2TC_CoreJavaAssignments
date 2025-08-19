package assignmentone.employees;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    private List<String> programmingLanguages;
    private String level; // Junior / Mid / Senior

    public Developer(String name, String employeeId, double salary,
                     List<String> languages, String level) {
        super(name, employeeId, salary);
        this.programmingLanguages = new ArrayList<>(languages);
        this.level = level;
        this.department = "Engineering";
    }

    public List<String> getProgrammingLanguages() {
        return new ArrayList<>(programmingLanguages);
    }

    public void addProgrammingLanguage(String lang) {
        if (!programmingLanguages.contains(lang)) programmingLanguages.add(lang);
    }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Level: " + level +
               ", Languages: " + programmingLanguages;
    }
}