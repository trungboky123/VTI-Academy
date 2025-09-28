package Assignments.Assignment_Lesson_3.Entity;

public enum TypeEnum {
    Essay(0), MultipleChoice(1);

    private final int value;

    TypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static TypeEnum getType(int value) {
        for (TypeEnum type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid value!");
    }
}
