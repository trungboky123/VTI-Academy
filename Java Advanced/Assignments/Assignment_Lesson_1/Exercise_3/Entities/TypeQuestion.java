package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "type_question")
public class TypeQuestion {
    @Id
    @Column(name = "Type_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeId;
    @Enumerated(EnumType.STRING)
    @Column(name = "Type_Name")
    private TypeEnum typeName;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public TypeEnum getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeEnum typeName) {
        this.typeName = typeName;
    }
}
