package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detaildepartment")
public class DetailDepartment {
    @Id
    @Column(name = "DepartmentID")
    private int deptId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "DepartmentID")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "AddressID")
    private Address address;

    @Column(name = "EmulatorPoint")
    private int emulatorPoint;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmulatorPoint() {
        return emulatorPoint;
    }

    public void setEmulatorPoint(int emulatorPoint) {
        this.emulatorPoint = emulatorPoint;
    }
}
