package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "classes_teachers", schema = "git_test01", catalog = "")
public class ClassesTeachersPo {
    @Basic
    @Column(name = "class_num")
    private String classNum;
    @Basic
    @Column(name = "teacher_num")
    private String teacherNum;
    @ManyToOne
    @JoinColumn(name = "class_num", referencedColumnName = "class_num")
    private ClassesPo classesByClassNum;
    @ManyToOne
    @JoinColumn(name = "teacher_num", referencedColumnName = "teacher_num")
    private TeachersPo teachersByTeacherNum;

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassesTeachersPo that = (ClassesTeachersPo) o;
        return Objects.equals(classNum, that.classNum) && Objects.equals(teacherNum, that.teacherNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classNum, teacherNum);
    }

    public ClassesPo getClassesByClassNum() {
        return classesByClassNum;
    }

    public void setClassesByClassNum(ClassesPo classesByClassNum) {
        this.classesByClassNum = classesByClassNum;
    }

    public TeachersPo getTeachersByTeacherNum() {
        return teachersByTeacherNum;
    }

    public void setTeachersByTeacherNum(TeachersPo teachersByTeacherNum) {
        this.teachersByTeacherNum = teachersByTeacherNum;
    }
}
