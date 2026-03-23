package Basics.UML.Aggregation;

import java.util.Arrays;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Jones");
        Professor prof2 = new Professor("Dr. Brown");

        List<Professor> professors = Arrays.asList(prof1, prof2);
        Department department = new Department("Computer Science", professors);

        // Aggregation relationship: department has professors, but professors exist independently
        department.showProfessors();
        // Output:
        // Department: Computer Science
        // Dr. Jones
        // Dr. Brown
    }
}
