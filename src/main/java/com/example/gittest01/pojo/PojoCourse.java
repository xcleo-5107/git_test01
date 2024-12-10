package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "course", schema = "git_test01" )
public class PojoCourse {
    @Basic
    @Column(name = "course_name")
    private String courseName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "course_num")
    private String courseNum;
    @Basic
    @Column(name = "course_credit")
    private double courseCredit;
    @Basic
    @Column(name = "course_preiod")
    private Integer coursePreiod;
    @Basic
    @Column(name = "semester")
    private String semester;
    @OneToMany(mappedBy = "courseByCourseNum")
    private Collection<PojoClass> classesByCourseNum;
    @ManyToOne
    @JoinColumn(name = "review_type", referencedColumnName = "type_num")
    private PojoReviewType reviewTypeByReviewType;
    @ManyToOne
    @JoinColumn(name = "major_num", referencedColumnName = "major_num")
    private PojoMajor majorByMajorNum;
    @OneToMany(mappedBy = "courseByCourseNum")
    private Collection<PojoExam> examsByCourseNum;
    @OneToMany(mappedBy = "courseByCourseNum")
    private Collection<PojoExamScheme> examSchemesByCourseNum;
    @OneToMany(mappedBy = "courseByCourseNum")
    private Collection<PojoExercise> exercisesByCourseNum;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "courses")
    private Collection<PojoTeacher> teachers;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getCoursePreiod() {
        return coursePreiod;
    }

    public void setCoursePreiod(Integer coursePreiod) {
        this.coursePreiod = coursePreiod;
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
        PojoCourse that = (PojoCourse) o;
        return Double.compare(courseCredit, that.courseCredit) == 0 && Objects.equals(courseName, that.courseName) && Objects.equals(courseNum, that.courseNum) && Objects.equals(coursePreiod, that.coursePreiod) && Objects.equals(semester, that.semester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseNum, courseCredit, coursePreiod, semester);
    }

    public Collection<PojoClass> getClazzesByCourseNum() {
        return classesByCourseNum;
    }

    public void setClazzesByCourseNum(Collection<PojoClass> clazzesByCourseNum) {
        this.classesByCourseNum = clazzesByCourseNum;
    }

    public PojoReviewType getReviewTypeByReviewType() {
        return reviewTypeByReviewType;
    }

    public void setReviewTypeByReviewType(PojoReviewType reviewTypeByReviewType) {
        this.reviewTypeByReviewType = reviewTypeByReviewType;
    }

    public PojoMajor getMajorByMajorNum() {
        return majorByMajorNum;
    }

    public void setMajorByMajorNum(PojoMajor majorByMajorNum) {
        this.majorByMajorNum = majorByMajorNum;
    }



    public Collection<PojoExam> getExamsByCourseNum() {
        return examsByCourseNum;
    }

    public void setExamsByCourseNum(Collection<PojoExam> examsByCourseNum) {
        this.examsByCourseNum = examsByCourseNum;
    }

    public Collection<PojoExamScheme> getExamSchemesByCourseNum() {
        return examSchemesByCourseNum;
    }

    public void setExamSchemesByCourseNum(Collection<PojoExamScheme> examSchemesByCourseNum) {
        this.examSchemesByCourseNum = examSchemesByCourseNum;
    }

    public Collection<PojoExercise> getExercisesByCourseNum() {
        return exercisesByCourseNum;
    }

    public void setExercisesByCourseNum(Collection<PojoExercise> exercisesByCourseNum) {
        this.exercisesByCourseNum = exercisesByCourseNum;
    }
}
