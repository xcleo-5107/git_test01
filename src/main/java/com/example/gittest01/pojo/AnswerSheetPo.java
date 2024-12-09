package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "answer_sheet", schema = "git_test01", catalog = "")
public class AnswerSheetPo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sheet_num")
    private int sheetNum;
    @Basic
    @Column(name = "scheme_num")
    private Integer schemeNum;
    @Basic
    @Column(name = "student_id")
    private String studentId;
    @Basic
    @Column(name = "total_score")
    private Integer totalScore;
    @Basic
    @Column(name = "sheet_status")
    private String sheetStatus;
    @ManyToOne
    @JoinColumn(name = "scheme_num", referencedColumnName = "scheme_num")
    private ExamSchemePo examSchemeBySchemeNum;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private StudentsPo studentsByStudentId;
    @ManyToOne
    @JoinColumn(name = "sheet_status", referencedColumnName = "type_num")
    private AnswerSheetStatusTypePo answerSheetStatusTypeBySheetStatus;
    @OneToMany(mappedBy = "answerSheetBySheetNum")
    private Collection<AnswerSheetDetailPo> answerSheetDetailsBySheetNum;

    public int getSheetNum() {
        return sheetNum;
    }

    public void setSheetNum(int sheetNum) {
        this.sheetNum = sheetNum;
    }

    public Integer getSchemeNum() {
        return schemeNum;
    }

    public void setSchemeNum(Integer schemeNum) {
        this.schemeNum = schemeNum;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getSheetStatus() {
        return sheetStatus;
    }

    public void setSheetStatus(String sheetStatus) {
        this.sheetStatus = sheetStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerSheetPo that = (AnswerSheetPo) o;
        return sheetNum == that.sheetNum && Objects.equals(schemeNum, that.schemeNum) && Objects.equals(studentId, that.studentId) && Objects.equals(totalScore, that.totalScore) && Objects.equals(sheetStatus, that.sheetStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sheetNum, schemeNum, studentId, totalScore, sheetStatus);
    }

    public ExamSchemePo getExamSchemeBySchemeNum() {
        return examSchemeBySchemeNum;
    }

    public void setExamSchemeBySchemeNum(ExamSchemePo examSchemeBySchemeNum) {
        this.examSchemeBySchemeNum = examSchemeBySchemeNum;
    }

    public StudentsPo getStudentsByStudentId() {
        return studentsByStudentId;
    }

    public void setStudentsByStudentId(StudentsPo studentsByStudentId) {
        this.studentsByStudentId = studentsByStudentId;
    }

    public AnswerSheetStatusTypePo getAnswerSheetStatusTypeBySheetStatus() {
        return answerSheetStatusTypeBySheetStatus;
    }

    public void setAnswerSheetStatusTypeBySheetStatus(AnswerSheetStatusTypePo answerSheetStatusTypeBySheetStatus) {
        this.answerSheetStatusTypeBySheetStatus = answerSheetStatusTypeBySheetStatus;
    }

    public Collection<AnswerSheetDetailPo> getAnswerSheetDetailsBySheetNum() {
        return answerSheetDetailsBySheetNum;
    }

    public void setAnswerSheetDetailsBySheetNum(Collection<AnswerSheetDetailPo> answerSheetDetailsBySheetNum) {
        this.answerSheetDetailsBySheetNum = answerSheetDetailsBySheetNum;
    }
}
