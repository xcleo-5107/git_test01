package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "majors", schema = "git_test01", catalog = "")
public class MajorsPo {
    @Basic
    @Column(name = "major_name")
    private String majorName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "major_num")
    private String majorNum;
    @OneToMany(mappedBy = "majorsByMajorNum")
    private Collection<CoursesPo> coursesByMajorNum;
    @OneToMany(mappedBy = "majorsByMajorNum")
    private Collection<StudentsPo> studentsByMajorNum;

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorNum() {
        return majorNum;
    }

    public void setMajorNum(String majorNum) {
        this.majorNum = majorNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MajorsPo majorsPo = (MajorsPo) o;
        return Objects.equals(majorName, majorsPo.majorName) && Objects.equals(majorNum, majorsPo.majorNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(majorName, majorNum);
    }

    public Collection<CoursesPo> getCoursesByMajorNum() {
        return coursesByMajorNum;
    }

    public void setCoursesByMajorNum(Collection<CoursesPo> coursesByMajorNum) {
        this.coursesByMajorNum = coursesByMajorNum;
    }

    public Collection<StudentsPo> getStudentsByMajorNum() {
        return studentsByMajorNum;
    }

    public void setStudentsByMajorNum(Collection<StudentsPo> studentsByMajorNum) {
        this.studentsByMajorNum = studentsByMajorNum;
    }
}
