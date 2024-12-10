package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "answer_sheet_detail", schema = "git_test01" )
public class PojoAnswerSheetDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "detail_id")
    private int detailId;
    @Basic
    @Column(name = "module_num")
    private Integer moduleNum;
    @Basic
    @Column(name = "exercise_in_module_num")
    private Integer exerciseInModuleNum;
    @Basic
    @Column(name = "answer")
    private String answer;
    @Basic
    @Column(name = "score")
    private Integer score;
    @ManyToOne
    @JoinColumn(name = "sheet_num", referencedColumnName = "sheet_num")
    private PojoAnswerSheet answerSheetBySheetNum;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoAnswerSheetDetail that = (PojoAnswerSheetDetail) o;
        return detailId == that.detailId && Objects.equals(moduleNum, that.moduleNum) && Objects.equals(exerciseInModuleNum, that.exerciseInModuleNum) && Objects.equals(answer, that.answer) && Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailId, moduleNum, exerciseInModuleNum, answer, score);
    }

    public PojoAnswerSheet getAnswerSheetBySheetNum() {
        return answerSheetBySheetNum;
    }

    public void setAnswerSheetBySheetNum(PojoAnswerSheet answerSheetBySheetNum) {
        this.answerSheetBySheetNum = answerSheetBySheetNum;
    }
}
