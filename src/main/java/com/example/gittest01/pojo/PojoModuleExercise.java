package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "module_exercise", schema = "git_test01" )
public class PojoModuleExercise {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "exercise_in_module_num")
    private Integer exerciseInModuleNum;
    @ManyToOne
    @JoinColumn(name = "exercise_num", referencedColumnName = "exercise_num")
    private PojoExercise exerciseByExerciseNum;
    @ManyToOne
    @JoinColumn(name = "module_num", referencedColumnName = "module_num")
    private PojoExamModule examModuleByModuleNum;

    public Integer getExerciseInModuleNum() {
        return exerciseInModuleNum;
    }

    public void setExerciseInModuleNum(Integer exerciseInModuleNum) {
        this.exerciseInModuleNum = exerciseInModuleNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoModuleExercise that = (PojoModuleExercise) o;
        return Objects.equals(exerciseInModuleNum, that.exerciseInModuleNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash( exerciseInModuleNum);
    }

    public PojoExercise getExerciseByExerciseNum() {
        return exerciseByExerciseNum;
    }

    public void setExerciseByExerciseNum(PojoExercise exerciseByExerciseNum) {
        this.exerciseByExerciseNum = exerciseByExerciseNum;
    }

    public PojoExamModule getExamModuleByModuleNum() {
        return examModuleByModuleNum;
    }

    public void setExamModuleByModuleNum(PojoExamModule examModuleByModuleNum) {
        this.examModuleByModuleNum = examModuleByModuleNum;
    }
}
