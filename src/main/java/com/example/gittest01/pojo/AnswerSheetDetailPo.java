package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "answer_sheet_detail", schema = "git_test01", catalog = "")
public class AnswerSheetDetailPo {
    @Id
    @Column(name="detail_id")
    private Integer detailId;

    @Basic
    @Column(name = "sheet_num")
    private Integer sheetNum;
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
    private AnswerSheetPo answerSheetBySheetNum;

    public Integer getSheetNum() {
        return sheetNum;
    }

    public void setSheetNum(Integer sheetNum) {
        this.sheetNum = sheetNum;
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

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerSheetDetailPo that = (AnswerSheetDetailPo) o;
        return Objects.equals(sheetNum, that.sheetNum) && Objects.equals(moduleNum, that.moduleNum) && Objects.equals(exerciseInModuleNum, that.exerciseInModuleNum) && Objects.equals(answer, that.answer) && Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sheetNum, moduleNum, exerciseInModuleNum, answer, score);
    }

    public AnswerSheetPo getAnswerSheetBySheetNum() {
        return answerSheetBySheetNum;
    }

    public void setAnswerSheetBySheetNum(AnswerSheetPo answerSheetBySheetNum) {
        this.answerSheetBySheetNum = answerSheetBySheetNum;
    }
}
