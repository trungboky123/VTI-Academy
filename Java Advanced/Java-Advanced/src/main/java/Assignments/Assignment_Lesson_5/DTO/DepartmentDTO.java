package Assignments.Assignment_Lesson_5.DTO;

public class DepartmentDTO {
    private int id;
    private String name;

    public DepartmentDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
