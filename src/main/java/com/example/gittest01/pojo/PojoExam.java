package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exam", schema = "git_test01" )
public class PojoExam {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "exam_num")
    private int examNum;
    @Basic
    @Column(name = "is_released")
    private Byte isReleased;
    @ManyToOne
    @JoinColumn(name = "course_num", referencedColumnName = "course_num")
    private PojoCourse courseByCourseNum;
    @ManyToOne
    @JoinColumn(name = "teacher_num", referencedColumnName = "teacher_num")
    private PojoTeacher teacherByTeacherNum;
    @OneToMany(mappedBy = "examByExamNum")
    private Collection<PojoExamModule> examModulesByExamNum;
    @OneToMany(mappedBy = "examByExamNum")
    private Collection<PojoExamScheme> examSchemesByExamNum;

    public int getExamNum() {
        return examNum;
    }

    public void setExamNum(int examNum) {
        this.examNum = examNum;
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
        PojoExam pojoExam = (PojoExam) o;
        return examNum == pojoExam.examNum && Objects.equals(isReleased, pojoExam.isReleased);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examNum,isReleased);
    }

    public PojoCourse getCourseByCourseNum() {
        return courseByCourseNum;
    }

    public void setCourseByCourseNum(PojoCourse courseByCourseNum) {
        this.courseByCourseNum = courseByCourseNum;
    }

    public PojoTeacher getTeacherByTeacherNum() {
        return teacherByTeacherNum;
    }

    public void setTeacherByTeacherNum(PojoTeacher teacherByTeacherNum) {
        this.teacherByTeacherNum = teacherByTeacherNum;
    }

    public Collection<PojoExamModule> getExamModulesByExamNum() {
        return examModulesByExamNum;
    }

    public void setExamModulesByExamNum(Collection<PojoExamModule> examModulesByExamNum) {
        this.examModulesByExamNum = examModulesByExamNum;
    }

    public Collection<PojoExamScheme> getExamSchemesByExamNum() {
        return examSchemesByExamNum;
    }

    public void setExamSchemesByExamNum(Collection<PojoExamScheme> examSchemesByExamNum) {
        this.examSchemesByExamNum = examSchemesByExamNum;
    }
}
