package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "teacher", schema = "git_test01" )
public class PojoTeacher {
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
    @OneToMany(mappedBy = "teacherByTeacherNum")
    private Collection<PojoExam> examsByTeacherNum;
    @OneToMany(mappedBy = "teacherByTeacherNum")
    private Collection<PojoTeacherAccount> teacherAccountsByTeacherNum;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "class_teacher",
            joinColumns = @JoinColumn(name = "teacher_num"),
            inverseJoinColumns = @JoinColumn(name = "class_num")
    )
    private Collection<PojoClass> classes;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "course_teacher",
            joinColumns = @JoinColumn(name = "teacher_num"),
            inverseJoinColumns = @JoinColumn(name = "course_num")
    )
    private Collection<PojoCourse> courses;

    public void setClasses(Collection<PojoClass> classes) {
        this.classes = classes;
    }

    public void setCourses(Collection<PojoCourse> courses) {
        this.courses = courses;
    }

    public Collection<PojoClass> getClasses() {
        return classes;
    }

    public Collection<PojoCourse> getCourses() {
        return courses;
    }

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
        PojoTeacher that = (PojoTeacher) o;
        return Objects.equals(teacherName, that.teacherName) && Objects.equals(teacherNum, that.teacherNum) && Objects.equals(teacherSex, that.teacherSex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherName, teacherNum, teacherSex);
    }

    public Collection<PojoExam> getExamsByTeacherNum() {
        return examsByTeacherNum;
    }

    public void setExamsByTeacherNum(Collection<PojoExam> examsByTeacherNum) {
        this.examsByTeacherNum = examsByTeacherNum;
    }

    public Collection<PojoTeacherAccount> getTeacherAccountsByTeacherNum() {
        return teacherAccountsByTeacherNum;
    }

    public void setTeacherAccountsByTeacherNum(Collection<PojoTeacherAccount> teacherAccountsByTeacherNum) {
        this.teacherAccountsByTeacherNum = teacherAccountsByTeacherNum;
    }
}
