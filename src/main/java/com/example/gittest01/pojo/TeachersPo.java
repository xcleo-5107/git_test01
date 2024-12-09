package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "teachers", schema = "git_test01", catalog = "")
public class TeachersPo {
    @Basic
    @Column(name = "teacher_name")
    private String teacherName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "teacher_num")
    private String teacherNum;
    @Basic
    @Column(name = "teacher_sex")
    private String teacherSex;
    @OneToMany(mappedBy = "teachersByTeacherNum")
    private Collection<ClassesTeachersPo> classesTeachersByTeacherNum;
    @OneToMany(mappedBy = "teachersByTeacherNum")
    private Collection<CoursesTeachersPo> coursesTeachersByTeacherNum;
    @OneToMany(mappedBy = "teachersByTeacherNum")
    private Collection<ExamsPo> examsByTeacherNum;
    @OneToMany(mappedBy = "teachersByTeacherNum")
    private Collection<TeacherAccountPo> teacherAccountsByTeacherNum;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeachersPo that = (TeachersPo) o;
        return Objects.equals(teacherName, that.teacherName) && Objects.equals(teacherNum, that.teacherNum) && Objects.equals(teacherSex, that.teacherSex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherName, teacherNum, teacherSex);
    }

    public Collection<ClassesTeachersPo> getClassesTeachersByTeacherNum() {
        return classesTeachersByTeacherNum;
    }

    public void setClassesTeachersByTeacherNum(Collection<ClassesTeachersPo> classesTeachersByTeacherNum) {
        this.classesTeachersByTeacherNum = classesTeachersByTeacherNum;
    }

    public Collection<CoursesTeachersPo> getCoursesTeachersByTeacherNum() {
        return coursesTeachersByTeacherNum;
    }

    public void setCoursesTeachersByTeacherNum(Collection<CoursesTeachersPo> coursesTeachersByTeacherNum) {
        this.coursesTeachersByTeacherNum = coursesTeachersByTeacherNum;
    }

    public Collection<ExamsPo> getExamsByTeacherNum() {
        return examsByTeacherNum;
    }

    public void setExamsByTeacherNum(Collection<ExamsPo> examsByTeacherNum) {
        this.examsByTeacherNum = examsByTeacherNum;
    }

    public Collection<TeacherAccountPo> getTeacherAccountsByTeacherNum() {
        return teacherAccountsByTeacherNum;
    }

    public void setTeacherAccountsByTeacherNum(Collection<TeacherAccountPo> teacherAccountsByTeacherNum) {
        this.teacherAccountsByTeacherNum = teacherAccountsByTeacherNum;
    }
}
