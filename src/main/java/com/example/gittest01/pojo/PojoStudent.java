package com.example.gittest01.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "student", schema = "git_test01" )
public class PojoStudent {
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
    @Column(name = "credit")
    private Double credit;
    @Basic
    @Column(name = "semester")
    private String semester;
    @OneToMany(mappedBy = "studentByStudentId")
    private Collection<PojoAnswerSheet> answerSheetsByStudentId;
    @ManyToOne
    @JoinColumn(name = "major_num", referencedColumnName = "major_num")
    private PojoMajor majorByMajorNum;
    @OneToMany(mappedBy = "studentByStudentId")
    private Collection<PojoStudentAccount> studentAccountsByStudentId;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name="class_student",
            joinColumns = @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name = "class_num")
    )
    private Collection<PojoClass> classes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoStudent that = (PojoStudent) o;
        return Objects.equals(studentName, that.studentName) && Objects.equals(studentId, that.studentId) && Objects.equals(studentSex, that.studentSex) && Objects.equals(credit, that.credit) && Objects.equals(semester, that.semester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentId, studentSex, credit, semester);
    }

    public Collection<PojoAnswerSheet> getAnswerSheetsByStudentId() {
        return answerSheetsByStudentId;
    }

    public void setAnswerSheetsByStudentId(Collection<PojoAnswerSheet> answerSheetsByStudentId) {
        this.answerSheetsByStudentId = answerSheetsByStudentId;
    }

    public PojoMajor getMajorByMajorNum() {
        return majorByMajorNum;
    }

    public void setMajorByMajorNum(PojoMajor majorByMajorNum) {
        this.majorByMajorNum = majorByMajorNum;
    }

    public Collection<PojoStudentAccount> getStudentAccountsByStudentId() {
        return studentAccountsByStudentId;
    }

    public void setStudentAccountsByStudentId(Collection<PojoStudentAccount> studentAccountsByStudentId) {
        this.studentAccountsByStudentId = studentAccountsByStudentId;
    }
}
