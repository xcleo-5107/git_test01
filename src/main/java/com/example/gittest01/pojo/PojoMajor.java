package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "major", schema = "git_test01" )
public class PojoMajor {
    @Basic
    @Column(name = "major_name")
    private String majorName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "major_num")
    private String majorNum;
    @OneToMany(mappedBy = "majorByMajorNum")
    private Collection<PojoCourse> coursesByMajorNum;
    @OneToMany(mappedBy = "majorByMajorNum")
    private Collection<PojoStudent> studentsByMajorNum;

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
        PojoMajor pojoMajor = (PojoMajor) o;
        return Objects.equals(majorName, pojoMajor.majorName) && Objects.equals(majorNum, pojoMajor.majorNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(majorName, majorNum);
    }

    public Collection<PojoCourse> getCoursesByMajorNum() {
        return coursesByMajorNum;
    }

    public void setCoursesByMajorNum(Collection<PojoCourse> coursesByMajorNum) {
        this.coursesByMajorNum = coursesByMajorNum;
    }

    public Collection<PojoStudent> getStudentsByMajorNum() {
        return studentsByMajorNum;
    }

    public void setStudentsByMajorNum(Collection<PojoStudent> studentsByMajorNum) {
        this.studentsByMajorNum = studentsByMajorNum;
    }
}
