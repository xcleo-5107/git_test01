package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "courses_teachers", schema = "git_test01", catalog = "")
public class CoursesTeachersPo {
    @Basic
    @Column(name = "course_num")
    private String courseNum;
    @Basic
    @Column(name = "teacher_num")
    private String teacherNum;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private CoursesPo coursesByCourseNum;
    @ManyToOne
    @JoinColumn(name = "teacher_num", referencedColumnName = "teacher_num")
    private TeachersPo teachersByTeacherNum;

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
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
        CoursesTeachersPo that = (CoursesTeachersPo) o;
        return Objects.equals(courseNum, that.courseNum) && Objects.equals(teacherNum, that.teacherNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNum, teacherNum);
    }

    public CoursesPo getCoursesByCourseNum() {
        return coursesByCourseNum;
    }

    public void setCoursesByCourseNum(CoursesPo coursesByCourseNum) {
        this.coursesByCourseNum = coursesByCourseNum;
    }

    public TeachersPo getTeachersByTeacherNum() {
        return teachersByTeacherNum;
    }

    public void setTeachersByTeacherNum(TeachersPo teachersByTeacherNum) {
        this.teachersByTeacherNum = teachersByTeacherNum;
    }
}
