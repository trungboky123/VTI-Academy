package Assignments.Assignment_Lesson_6.DTO;

public class DepartmentDTO {
    private Integer id;
    private Integer totalMember;
    private String name;

    public DepartmentDTO(Integer id, Integer totalMember, String name) {
        this.id = id;
        this.totalMember = totalMember;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTotalMember() {
        return totalMember;
    }

    public String getName() {
        return name;
    }
}
