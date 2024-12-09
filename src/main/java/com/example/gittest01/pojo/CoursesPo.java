package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "courses", schema = "git_test01", catalog = "")
public class CoursesPo {
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
    @Column(name = "review_type")
    private String reviewType;
    @Basic
    @Column(name = "major_num")
    private String majorNum;
    @Basic
    @Column(name = "semester")
    private String semester;
    @OneToMany(mappedBy = "coursesByCourseNum")
    private Collection<ClassesPo> classesByCourseNum;
    @ManyToOne
    @JoinColumn(name = "review_type", referencedColumnName = "type_num")
    private ReviewTypePo reviewTypeByReviewType;
    @ManyToOne
    @JoinColumn(name = "major_num", referencedColumnName = "major_num")
    private MajorsPo majorsByMajorNum;
    @OneToMany(mappedBy = "coursesByCourseNum")
    private Collection<CoursesTeachersPo> coursesTeachersByCourseNum;
    @OneToMany(mappedBy = "coursesByCourseNum")
    private Collection<ExamSchemePo> examSchemesByCourseNum;
    @OneToMany(mappedBy = "coursesByCourseNum")
    private Collection<ExamsPo> examsByCourseNum;
    @OneToMany(mappedBy = "coursesByCourseNum")
    private Collection<ExercisesPo> exercisesByCourseNum;

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

    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }

    public String getMajorNum() {
        return majorNum;
    }

    public void setMajorNum(String majorNum) {
        this.majorNum = majorNum;
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
        CoursesPo coursesPo = (CoursesPo) o;
        return Double.compare(courseCredit, coursesPo.courseCredit) == 0 && Objects.equals(courseName, coursesPo.courseName) && Objects.equals(courseNum, coursesPo.courseNum) && Objects.equals(coursePreiod, coursesPo.coursePreiod) && Objects.equals(reviewType, coursesPo.reviewType) && Objects.equals(majorNum, coursesPo.majorNum) && Objects.equals(semester, coursesPo.semester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseNum, courseCredit, coursePreiod, reviewType, majorNum, semester);
    }

    public Collection<ClassesPo> getClassesByCourseNum() {
        return classesByCourseNum;
    }

    public void setClassesByCourseNum(Collection<ClassesPo> classesByCourseNum) {
        this.classesByCourseNum = classesByCourseNum;
    }

    public ReviewTypePo getReviewTypeByReviewType() {
        return reviewTypeByReviewType;
    }

    public void setReviewTypeByReviewType(ReviewTypePo reviewTypeByReviewType) {
        this.reviewTypeByReviewType = reviewTypeByReviewType;
    }

    public MajorsPo getMajorsByMajorNum() {
        return majorsByMajorNum;
    }

    public void setMajorsByMajorNum(MajorsPo majorsByMajorNum) {
        this.majorsByMajorNum = majorsByMajorNum;
    }

    public Collection<CoursesTeachersPo> getCoursesTeachersByCourseNum() {
        return coursesTeachersByCourseNum;
    }

    public void setCoursesTeachersByCourseNum(Collection<CoursesTeachersPo> coursesTeachersByCourseNum) {
        this.coursesTeachersByCourseNum = coursesTeachersByCourseNum;
    }

    public Collection<ExamSchemePo> getExamSchemesByCourseNum() {
        return examSchemesByCourseNum;
    }

    public void setExamSchemesByCourseNum(Collection<ExamSchemePo> examSchemesByCourseNum) {
        this.examSchemesByCourseNum = examSchemesByCourseNum;
    }

    public Collection<ExamsPo> getExamsByCourseNum() {
        return examsByCourseNum;
    }

    public void setExamsByCourseNum(Collection<ExamsPo> examsByCourseNum) {
        this.examsByCourseNum = examsByCourseNum;
    }

    public Collection<ExercisesPo> getExercisesByCourseNum() {
        return exercisesByCourseNum;
    }

    public void setExercisesByCourseNum(Collection<ExercisesPo> exercisesByCourseNum) {
        this.exercisesByCourseNum = exercisesByCourseNum;
    }
}
