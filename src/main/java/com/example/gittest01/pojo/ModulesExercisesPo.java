package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "modules_exercises", schema = "git_test01", catalog = "")
public class ModulesExercisesPo {
    @Basic
    @Column(name = "exercise_num")
    private Integer exerciseNum;
    @Basic
    @Column(name = "module_num")
    private Integer moduleNum;
    @Basic
    @Column(name = "exercise_in_module_num")
    private Integer exerciseInModuleNum;
    @ManyToOne
    @JoinColumn(name = "exercise_num", referencedColumnName = "exercise_num")
    private ExercisesPo exercisesByExerciseNum;
    @ManyToOne
    @JoinColumn(name = "module_num", referencedColumnName = "module_num")
    private ExamsModulesPo examsModulesByModuleNum;

    public Integer getExerciseNum() {
        return exerciseNum;
    }

    public void setExerciseNum(Integer exerciseNum) {
        this.exerciseNum = exerciseNum;
    }

    public Integer getModuleNum() {
        return moduleNum;
    }

    public void setModuleNum(Integer moduleNum) {
        this.moduleNum = moduleNum;
    }

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
        ModulesExercisesPo that = (ModulesExercisesPo) o;
        return Objects.equals(exerciseNum, that.exerciseNum) && Objects.equals(moduleNum, that.moduleNum) && Objects.equals(exerciseInModuleNum, that.exerciseInModuleNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseNum, moduleNum, exerciseInModuleNum);
    }

    public ExercisesPo getExercisesByExerciseNum() {
        return exercisesByExerciseNum;
    }

    public void setExercisesByExerciseNum(ExercisesPo exercisesByExerciseNum) {
        this.exercisesByExerciseNum = exercisesByExerciseNum;
    }

    public ExamsModulesPo getExamsModulesByModuleNum() {
        return examsModulesByModuleNum;
    }

    public void setExamsModulesByModuleNum(ExamsModulesPo examsModulesByModuleNum) {
        this.examsModulesByModuleNum = examsModulesByModuleNum;
    }
}
