package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exams_modules", schema = "git_test01", catalog = "")
public class ExamsModulesPo {
    @Basic
    @Column(name = "exam_num")
    private Integer examNum;
    @Basic
    @Column(name = "exercise_type")
    private String exerciseType;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "module_num")
    private int moduleNum;
    @Basic
    @Column(name = "module_in_exam_num")
    private Integer moduleInExamNum;
    @ManyToOne
    @JoinColumn(name = "exam_num", referencedColumnName = "exam_num")
    private ExamsPo examsByExamNum;
    @ManyToOne
    @JoinColumn(name = "exercise_type", referencedColumnName = "type_num")
    private ExerciseTypePo exerciseTypeByExerciseType;
    @OneToMany(mappedBy = "examsModulesByModuleNum")
    private Collection<ModulesExercisesPo> modulesExercisesByModuleNum;

    public Integer getExamNum() {
        return examNum;
    }

    public void setExamNum(Integer examNum) {
        this.examNum = examNum;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public int getModuleNum() {
        return moduleNum;
    }

    public void setModuleNum(int moduleNum) {
        this.moduleNum = moduleNum;
    }

    public Integer getModuleInExamNum() {
        return moduleInExamNum;
    }

    public void setModuleInExamNum(Integer moduleInExamNum) {
        this.moduleInExamNum = moduleInExamNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamsModulesPo that = (ExamsModulesPo) o;
        return moduleNum == that.moduleNum && Objects.equals(examNum, that.examNum) && Objects.equals(exerciseType, that.exerciseType) && Objects.equals(moduleInExamNum, that.moduleInExamNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examNum, exerciseType, moduleNum, moduleInExamNum);
    }

    public ExamsPo getExamsByExamNum() {
        return examsByExamNum;
    }

    public void setExamsByExamNum(ExamsPo examsByExamNum) {
        this.examsByExamNum = examsByExamNum;
    }

    public ExerciseTypePo getExerciseTypeByExerciseType() {
        return exerciseTypeByExerciseType;
    }

    public void setExerciseTypeByExerciseType(ExerciseTypePo exerciseTypeByExerciseType) {
        this.exerciseTypeByExerciseType = exerciseTypeByExerciseType;
    }

    public Collection<ModulesExercisesPo> getModulesExercisesByModuleNum() {
        return modulesExercisesByModuleNum;
    }

    public void setModulesExercisesByModuleNum(Collection<ModulesExercisesPo> modulesExercisesByModuleNum) {
        this.modulesExercisesByModuleNum = modulesExercisesByModuleNum;
    }
}
