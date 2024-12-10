package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exam_module", schema = "git_test01" )
public class PojoExamModule {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "module_num")
    private int moduleNum;
    @Basic
    @Column(name = "module_in_exam_num")
    private Integer moduleInExamNum;
    @ManyToOne
    @JoinColumn(name = "exam_num", referencedColumnName = "exam_num")
    private PojoExam examByExamNum;
    @ManyToOne
    @JoinColumn(name = "exercise_type", referencedColumnName = "type_num")
    private PojoExerciseType exerciseTypeByExerciseType;
    @OneToMany(mappedBy = "examModuleByModuleNum")
    private Collection<PojoModuleExercise> moduleExercisesByModuleNum;

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
        PojoExamModule that = (PojoExamModule) o;
        return moduleNum == that.moduleNum && Objects.equals(moduleInExamNum, that.moduleInExamNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleNum, moduleInExamNum);
    }

    public PojoExam getExamByExamNum() {
        return examByExamNum;
    }

    public void setExamByExamNum(PojoExam examByExamNum) {
        this.examByExamNum = examByExamNum;
    }

    public PojoExerciseType getExerciseTypeByExerciseType() {
        return exerciseTypeByExerciseType;
    }

    public void setExerciseTypeByExerciseType(PojoExerciseType exerciseTypeByExerciseType) {
        this.exerciseTypeByExerciseType = exerciseTypeByExerciseType;
    }

    public Collection<PojoModuleExercise> getModuleExercisesByModuleNum() {
        return moduleExercisesByModuleNum;
    }

    public void setModuleExercisesByModuleNum(Collection<PojoModuleExercise> moduleExercisesByModuleNum) {
        this.moduleExercisesByModuleNum = moduleExercisesByModuleNum;
    }
}
