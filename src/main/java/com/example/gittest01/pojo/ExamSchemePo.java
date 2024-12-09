package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exam_scheme", schema = "git_test01", catalog = "")
public class ExamSchemePo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "scheme_num")
    private int schemeNum;
    @Basic
    @Column(name = "exam_num")
    private Integer examNum;
    @Basic
    @Column(name = "scheme_location")
    private String schemeLocation;
    @Basic
    @Column(name = "scheme_begin")
    private Timestamp schemeBegin;
    @Basic
    @Column(name = "scheme_end")
    private Timestamp schemeEnd;
    @Basic
    @Column(name = "course_num")
    private String courseNum;
    @Basic
    @Column(name = "exam_type")
    private String examType;
    @Basic
    @Column(name = "class_num")
    private String classNum;
    @Basic
    @Column(name = "teacher_nums")
    private String teacherNums;
    @OneToMany(mappedBy = "examSchemeBySchemeNum")
    private Collection<AnswerSheetPo> answerSheetsBySchemeNum;
    @ManyToOne
    @JoinColumn(name = "exam_num", referencedColumnName = "exam_num")
    private ExamsPo examsByExamNum;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private CoursesPo coursesByCourseNum;
    @ManyToOne
    @JoinColumn(name = "exam_type", referencedColumnName = "type_num")
    private ExamTypePo examTypeByExamType;

    public int getSchemeNum() {
        return schemeNum;
    }

    public void setSchemeNum(int schemeNum) {
        this.schemeNum = schemeNum;
    }

    public Integer getExamNum() {
        return examNum;
    }

    public void setExamNum(Integer examNum) {
        this.examNum = examNum;
    }

    public String getSchemeLocation() {
        return schemeLocation;
    }

    public void setSchemeLocation(String schemeLocation) {
        this.schemeLocation = schemeLocation;
    }

    public Timestamp getSchemeBegin() {
        return schemeBegin;
    }

    public void setSchemeBegin(Timestamp schemeBegin) {
        this.schemeBegin = schemeBegin;
    }

    public Timestamp getSchemeEnd() {
        return schemeEnd;
    }

    public void setSchemeEnd(Timestamp schemeEnd) {
        this.schemeEnd = schemeEnd;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getTeacherNums() {
        return teacherNums;
    }

    public void setTeacherNums(String teacherNums) {
        this.teacherNums = teacherNums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamSchemePo that = (ExamSchemePo) o;
        return schemeNum == that.schemeNum && Objects.equals(examNum, that.examNum) && Objects.equals(schemeLocation, that.schemeLocation) && Objects.equals(schemeBegin, that.schemeBegin) && Objects.equals(schemeEnd, that.schemeEnd) && Objects.equals(courseNum, that.courseNum) && Objects.equals(examType, that.examType) && Objects.equals(classNum, that.classNum) && Objects.equals(teacherNums, that.teacherNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeNum, examNum, schemeLocation, schemeBegin, schemeEnd, courseNum, examType, classNum, teacherNums);
    }

    public Collection<AnswerSheetPo> getAnswerSheetsBySchemeNum() {
        return answerSheetsBySchemeNum;
    }

    public void setAnswerSheetsBySchemeNum(Collection<AnswerSheetPo> answerSheetsBySchemeNum) {
        this.answerSheetsBySchemeNum = answerSheetsBySchemeNum;
    }

    public ExamsPo getExamsByExamNum() {
        return examsByExamNum;
    }

    public void setExamsByExamNum(ExamsPo examsByExamNum) {
        this.examsByExamNum = examsByExamNum;
    }

    public CoursesPo getCoursesByCourseNum() {
        return coursesByCourseNum;
    }

    public void setCoursesByCourseNum(CoursesPo coursesByCourseNum) {
        this.coursesByCourseNum = coursesByCourseNum;
    }

    public ExamTypePo getExamTypeByExamType() {
        return examTypeByExamType;
    }

    public void setExamTypeByExamType(ExamTypePo examTypeByExamType) {
        this.examTypeByExamType = examTypeByExamType;
    }
}
