package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exams", schema = "git_test01", catalog = "")
public class ExamsPo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "exam_num")
    private int examNum;
    @Basic
    @Column(name = "course_num")
    private String courseNum;
    @Basic
    @Column(name = "teacher_num")
    private String teacherNum;
    @Basic
    @Column(name = "is_released")
    private Byte isReleased;
    @OneToMany(mappedBy = "examsByExamNum")
    private Collection<ExamSchemePo> examSchemesByExamNum;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private CoursesPo coursesByCourseNum;
    @ManyToOne
    @JoinColumn(name = "teacher_num", referencedColumnName = "teacher_num")
    private TeachersPo teachersByTeacherNum;
    @OneToMany(mappedBy = "examsByExamNum")
    private Collection<ExamsModulesPo> examsModulesByExamNum;

    public int getExamNum() {
        return examNum;
    }

    public void setExamNum(int examNum) {
        this.examNum = examNum;
    }

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

    public Byte getIsReleased() {
        return isReleased;
    }

    public void setIsReleased(Byte isReleased) {
        this.isReleased = isReleased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamsPo examsPo = (ExamsPo) o;
        return examNum == examsPo.examNum && Objects.equals(courseNum, examsPo.courseNum) && Objects.equals(teacherNum, examsPo.teacherNum) && Objects.equals(isReleased, examsPo.isReleased);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examNum, courseNum, teacherNum, isReleased);
    }

    public Collection<ExamSchemePo> getExamSchemesByExamNum() {
        return examSchemesByExamNum;
    }

    public void setExamSchemesByExamNum(Collection<ExamSchemePo> examSchemesByExamNum) {
        this.examSchemesByExamNum = examSchemesByExamNum;
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

    public Collection<ExamsModulesPo> getExamsModulesByExamNum() {
        return examsModulesByExamNum;
    }

    public void setExamsModulesByExamNum(Collection<ExamsModulesPo> examsModulesByExamNum) {
        this.examsModulesByExamNum = examsModulesByExamNum;
    }
}
