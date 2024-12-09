package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "classes_students", schema = "git_test01", catalog = "")
public class ClassesStudentsPo {
    @Basic
    @Column(name = "class_num")
    private String classNum;
    @Basic
    @Column(name = "student_id")
    private String studentId;
    @ManyToOne
    @JoinColumn(name = "class_num", referencedColumnName = "class_num")
    private ClassesPo classesByClassNum;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private StudentsPo studentsByStudentId;

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassesStudentsPo that = (ClassesStudentsPo) o;
        return Objects.equals(classNum, that.classNum) && Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classNum, studentId);
    }

    public ClassesPo getClassesByClassNum() {
        return classesByClassNum;
    }

    public void setClassesByClassNum(ClassesPo classesByClassNum) {
        this.classesByClassNum = classesByClassNum;
    }

    public StudentsPo getStudentsByStudentId() {
        return studentsByStudentId;
    }

    public void setStudentsByStudentId(StudentsPo studentsByStudentId) {
        this.studentsByStudentId = studentsByStudentId;
    }
}
