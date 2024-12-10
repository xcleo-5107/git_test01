package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exercise", schema = "git_test01" )
public class PojoExercise {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "exercise_num")
    private int exerciseNum;

    @Basic
    @Column(name = "exercise_info")
    private String exerciseInfo;
    @Basic
    @Column(name = "exercise_problem")
    private String exerciseProblem;
    @Basic
    @Column(name = "exercise_answer")
    private String exerciseAnswer;
    @Basic
    @Column(name = "exercise_other")
    private byte[] exerciseOther;
    @ManyToOne
    @JoinColumn(name = "type_num", referencedColumnName = "type_num")
    private PojoExerciseType exerciseTypeByTypeNum;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private PojoCourse courseByCourseNum;

    public int getExerciseNum() {
        return exerciseNum;
    }

    public void setExerciseNum(int exerciseNum) {
        this.exerciseNum = exerciseNum;
    }

    public String getExerciseInfo() {
        return exerciseInfo;
    }

    public void setExerciseInfo(String exerciseInfo) {
        this.exerciseInfo = exerciseInfo;
    }

    public String getExerciseProblem() {
        return exerciseProblem;
    }

    public void setExerciseProblem(String exerciseProblem) {
        this.exerciseProblem = exerciseProblem;
    }

    public String getExerciseAnswer() {
        return exerciseAnswer;
    }

    public void setExerciseAnswer(String exerciseAnswer) {
        this.exerciseAnswer = exerciseAnswer;
    }

    public byte[] getExerciseOther() {
        return exerciseOther;
    }

    public void setExerciseOther(byte[] exerciseOther) {
        this.exerciseOther = exerciseOther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoExercise that = (PojoExercise) o;
        return exerciseNum == that.exerciseNum && Objects.equals(exerciseInfo, that.exerciseInfo) && Objects.equals(exerciseProblem, that.exerciseProblem) && Objects.equals(exerciseAnswer, that.exerciseAnswer) && Arrays.equals(exerciseOther, that.exerciseOther);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(exerciseNum, exerciseInfo, exerciseProblem, exerciseAnswer);
        result = 31 * result + Arrays.hashCode(exerciseOther);
        return result;
    }

    public PojoExerciseType getExerciseTypeByTypeNum() {
        return exerciseTypeByTypeNum;
    }

    public void setExerciseTypeByTypeNum(PojoExerciseType exerciseTypeByTypeNum) {
        this.exerciseTypeByTypeNum = exerciseTypeByTypeNum;
    }

    public PojoCourse getCourseByCourseNum() {
        return courseByCourseNum;
    }

    public void setCourseByCourseNum(PojoCourse courseByCourseNum) {
        this.courseByCourseNum = courseByCourseNum;
    }
}
