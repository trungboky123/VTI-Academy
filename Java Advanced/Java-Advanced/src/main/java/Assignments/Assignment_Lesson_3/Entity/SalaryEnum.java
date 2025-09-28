package Assignments.Assignment_Lesson_3.Entity;

public enum SalaryEnum {
    Dev(600), Test(700), ScrumMaster(1500), PM(2000);

    private final int value;

    SalaryEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
