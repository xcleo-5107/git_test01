package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exam_scheme", schema = "git_test01" )
public class PojoExamScheme {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "scheme_num")
    private int schemeNum;
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
    @Column(name = "class_num")
    private String classNum;
    @Basic
    @Column(name = "teacher_nums")
    private String teacherNums;
    @OneToMany(mappedBy = "examSchemeBySchemeNum")
    private Collection<PojoAnswerSheet> answerSheetsBySchemeNum;
    @ManyToOne
    @JoinColumn(name = "exam_num", referencedColumnName = "exam_num")
    private PojoExam examByExamNum;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private PojoCourse courseByCourseNum;
    @ManyToOne
    @JoinColumn(name = "exam_type", referencedColumnName = "type_num")
    private PojoExamType examTypeByExamType;

    public int getSchemeNum() {
        return schemeNum;
    }

    public void setSchemeNum(int schemeNum) {
        this.schemeNum = schemeNum;
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
        PojoExamScheme that = (PojoExamScheme) o;
        return schemeNum == that.schemeNum && Objects.equals(schemeLocation, that.schemeLocation) && Objects.equals(schemeBegin, that.schemeBegin) && Objects.equals(schemeEnd, that.schemeEnd) && Objects.equals(classNum, that.classNum) && Objects.equals(teacherNums, that.teacherNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeNum, schemeLocation, schemeBegin, schemeEnd, classNum, teacherNums);
    }

    public Collection<PojoAnswerSheet> getAnswerSheetsBySchemeNum() {
        return answerSheetsBySchemeNum;
    }

    public void setAnswerSheetsBySchemeNum(Collection<PojoAnswerSheet> answerSheetsBySchemeNum) {
        this.answerSheetsBySchemeNum = answerSheetsBySchemeNum;
    }

    public PojoExam getExamByExamNum() {
        return examByExamNum;
    }

    public void setExamByExamNum(PojoExam examByExamNum) {
        this.examByExamNum = examByExamNum;
    }

    public PojoCourse getCourseByCourseNum() {
        return courseByCourseNum;
    }

    public void setCourseByCourseNum(PojoCourse courseByCourseNum) {
        this.courseByCourseNum = courseByCourseNum;
    }

    public PojoExamType getExamTypeByExamType() {
        return examTypeByExamType;
    }

    public void setExamTypeByExamType(PojoExamType examTypeByExamType) {
        this.examTypeByExamType = examTypeByExamType;
    }
}
