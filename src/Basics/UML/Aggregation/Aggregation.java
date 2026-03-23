package Basics.UML.Aggregation;

import java.util.List;

// Professor class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class (Aggregation relationship)
class Department {
    private String name;
    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors() {
        System.out.println("Department: " + name);
        for (Professor prof : professors) {
            System.out.println(prof.getName());
        }
    }
}


