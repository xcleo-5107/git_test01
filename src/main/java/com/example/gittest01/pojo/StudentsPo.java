package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "students", schema = "git_test01", catalog = "")
public class StudentsPo {
    @Basic
    @Column(name = "student_name")
    private String studentName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "student_id")
    private String studentId;
    @Basic
    @Column(name = "student_sex")
    private String studentSex;
    @Basic
    @Column(name = "major_num")
    private String majorNum;
    @Basic
    @Column(name = "credit")
    private Double credit;
    @Basic
    @Column(name = "semester")
    private String semester;
    @OneToMany(mappedBy = "studentsByStudentId")
    private Collection<AnswerSheetPo> answerSheetsByStudentId;
    @OneToMany(mappedBy = "studentsByStudentId")
    private Collection<ClassesStudentsPo> classesStudentsByStudentId;
    @OneToMany(mappedBy = "studentsByStudentId")
    private Collection<StudentAccountPo> studentAccountsByStudentId;
    @ManyToOne
    @JoinColumn(name = "major_num", referencedColumnName = "major_num")
    private MajorsPo majorsByMajorNum;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getMajorNum() {
        return majorNum;
    }

    public void setMajorNum(String majorNum) {
        this.majorNum = majorNum;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsPo that = (StudentsPo) o;
        return Objects.equals(studentName, that.studentName) && Objects.equals(studentId, that.studentId) && Objects.equals(studentSex, that.studentSex) && Objects.equals(majorNum, that.majorNum) && Objects.equals(credit, that.credit) && Objects.equals(semester, that.semester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentId, studentSex, majorNum, credit, semester);
    }

    public Collection<AnswerSheetPo> getAnswerSheetsByStudentId() {
        return answerSheetsByStudentId;
    }

    public void setAnswerSheetsByStudentId(Collection<AnswerSheetPo> answerSheetsByStudentId) {
        this.answerSheetsByStudentId = answerSheetsByStudentId;
    }

    public Collection<ClassesStudentsPo> getClassesStudentsByStudentId() {
        return classesStudentsByStudentId;
    }

    public void setClassesStudentsByStudentId(Collection<ClassesStudentsPo> classesStudentsByStudentId) {
        this.classesStudentsByStudentId = classesStudentsByStudentId;
    }

    public Collection<StudentAccountPo> getStudentAccountsByStudentId() {
        return studentAccountsByStudentId;
    }

    public void setStudentAccountsByStudentId(Collection<StudentAccountPo> studentAccountsByStudentId) {
        this.studentAccountsByStudentId = studentAccountsByStudentId;
    }

    public MajorsPo getMajorsByMajorNum() {
        return majorsByMajorNum;
    }

    public void setMajorsByMajorNum(MajorsPo majorsByMajorNum) {
        this.majorsByMajorNum = majorsByMajorNum;
    }
}
