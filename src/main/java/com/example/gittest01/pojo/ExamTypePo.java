package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "exam_type", schema = "git_test01", catalog = "")
public class ExamTypePo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "type_num")
    private String typeNum;
    @Basic
    @Column(name = "type_name")
    private String typeName;
    @OneToMany(mappedBy = "examTypeByExamType")
    private Collection<ExamSchemePo> examSchemesByTypeNum;

    public String getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamTypePo that = (ExamTypePo) o;
        return Objects.equals(typeNum, that.typeNum) && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeNum, typeName);
    }

    public Collection<ExamSchemePo> getExamSchemesByTypeNum() {
        return examSchemesByTypeNum;
    }

    public void setExamSchemesByTypeNum(Collection<ExamSchemePo> examSchemesByTypeNum) {
        this.examSchemesByTypeNum = examSchemesByTypeNum;
    }
}
