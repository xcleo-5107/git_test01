package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "class", schema = "git_test01" )
public class PojoClass {
    @Basic
    @Column(name = "class_name")
    private String className;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "class_num")
    private String classNum;
    @Basic
    @Column(name = "class_time")
    private String classTime;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private PojoCourse courseByCourseNum;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "classes")
    private Collection<PojoStudent> students;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "classes")
    private Collection<PojoTeacher> teachers;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public void setStudents(Collection<PojoStudent> students) {
        this.students = students;
    }

    public void setTeachers(Collection<PojoTeacher> teachers) {
        this.teachers = teachers;
    }

    public Collection<PojoStudent> getStudents() {
        return students;
    }

    public Collection<PojoTeacher> getTeachers() {
        return teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoClass pojoClass = (PojoClass) o;
        return Objects.equals(className, pojoClass.className) && Objects.equals(classNum, pojoClass.classNum) && Objects.equals(classTime, pojoClass.classTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, classNum, classTime);
    }

    public PojoCourse getCourseByCourseNum() {
        return courseByCourseNum;
    }

    public void setCourseByCourseNum(PojoCourse courseByCourseNum) {
        this.courseByCourseNum = courseByCourseNum;
    }

}
