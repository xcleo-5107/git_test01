package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "classes", schema = "git_test01", catalog = "")
public class ClassesPo {
    @Basic
    @Column(name = "class_name")
    private String className;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "class_num")
    private String classNum;
    @Basic
    @Column(name = "course_num")
    private String courseNum;
    @Basic
    @Column(name = "class_time")
    private String classTime;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private CoursesPo coursesByCourseNum;
    @OneToMany(mappedBy = "classesByClassNum")
    private Collection<ClassesStudentsPo> classesStudentsByClassNum;
    @OneToMany(mappedBy = "classesByClassNum")
    private Collection<ClassesTeachersPo> classesTeachersByClassNum;

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

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassesPo classesPo = (ClassesPo) o;
        return Objects.equals(className, classesPo.className) && Objects.equals(classNum, classesPo.classNum) && Objects.equals(courseNum, classesPo.courseNum) && Objects.equals(classTime, classesPo.classTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, classNum, courseNum, classTime);
    }

    public CoursesPo getCoursesByCourseNum() {
        return coursesByCourseNum;
    }

    public void setCoursesByCourseNum(CoursesPo coursesByCourseNum) {
        this.coursesByCourseNum = coursesByCourseNum;
    }

    public Collection<ClassesStudentsPo> getClassesStudentsByClassNum() {
        return classesStudentsByClassNum;
    }

    public void setClassesStudentsByClassNum(Collection<ClassesStudentsPo> classesStudentsByClassNum) {
        this.classesStudentsByClassNum = classesStudentsByClassNum;
    }

    public Collection<ClassesTeachersPo> getClassesTeachersByClassNum() {
        return classesTeachersByClassNum;
    }

    public void setClassesTeachersByClassNum(Collection<ClassesTeachersPo> classesTeachersByClassNum) {
        this.classesTeachersByClassNum = classesTeachersByClassNum;
    }
}
