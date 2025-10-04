package Assignments.Assignment_Lesson_7.Entity;

import lombok.Getter;

@Getter
public enum SalaryEnum {
    Dev(600), Test(700), ScrumMaster(1500), PM(2000);

    private final int value;

    SalaryEnum(int value) {
        this.value = value;
    }

}
