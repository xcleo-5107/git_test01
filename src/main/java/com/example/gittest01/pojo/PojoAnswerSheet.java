package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "answer_sheet", schema = "git_test01" )
public class PojoAnswerSheet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sheet_num")
    private int sheetNum;
    @Basic
    @Column(name = "total_score")
    private Integer totalScore;
    @ManyToOne
    @JoinColumn(name = "scheme_num", referencedColumnName = "scheme_num")
    private PojoExamScheme examSchemeBySchemeNum;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private PojoStudent studentByStudentId;
    @ManyToOne
    @JoinColumn(name = "sheet_status", referencedColumnName = "type_num")
    private PojoAnswerSheetStatusType answerSheetStatusTypeBySheetStatus;
    @OneToMany(mappedBy = "answerSheetBySheetNum")
    private Collection<PojoAnswerSheetDetail> answerSheetDetailsBySheetNum;

    public int getSheetNum() {
        return sheetNum;
    }

    public void setSheetNum(int sheetNum) {
        this.sheetNum = sheetNum;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoAnswerSheet that = (PojoAnswerSheet) o;
        return sheetNum == that.sheetNum && Objects.equals(totalScore, that.totalScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sheetNum, totalScore);
    }

    public PojoExamScheme getExamSchemeBySchemeNum() {
        return examSchemeBySchemeNum;
    }

    public void setExamSchemeBySchemeNum(PojoExamScheme examSchemeBySchemeNum) {
        this.examSchemeBySchemeNum = examSchemeBySchemeNum;
    }

    public PojoStudent getStudentByStudentId() {
        return studentByStudentId;
    }

    public void setStudentByStudentId(PojoStudent studentByStudentId) {
        this.studentByStudentId = studentByStudentId;
    }

    public PojoAnswerSheetStatusType getAnswerSheetStatusTypeBySheetStatus() {
        return answerSheetStatusTypeBySheetStatus;
    }

    public void setAnswerSheetStatusTypeBySheetStatus(PojoAnswerSheetStatusType answerSheetStatusTypeBySheetStatus) {
        this.answerSheetStatusTypeBySheetStatus = answerSheetStatusTypeBySheetStatus;
    }

    public Collection<PojoAnswerSheetDetail> getAnswerSheetDetailsBySheetNum() {
        return answerSheetDetailsBySheetNum;
    }

    public void setAnswerSheetDetailsBySheetNum(Collection<PojoAnswerSheetDetail> answerSheetDetailsBySheetNum) {
        this.answerSheetDetailsBySheetNum = answerSheetDetailsBySheetNum;
    }
}
