package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "answer_sheet_status_type", schema = "git_test01", catalog = "")
public class AnswerSheetStatusTypePo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "type_num")
    private String typeNum;
    @Basic
    @Column(name = "type_name")
    private String typeName;
    @OneToMany(mappedBy = "answerSheetStatusTypeBySheetStatus")
    private Collection<AnswerSheetPo> answerSheetsByTypeNum;

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
        AnswerSheetStatusTypePo that = (AnswerSheetStatusTypePo) o;
        return Objects.equals(typeNum, that.typeNum) && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeNum, typeName);
    }

    public Collection<AnswerSheetPo> getAnswerSheetsByTypeNum() {
        return answerSheetsByTypeNum;
    }

    public void setAnswerSheetsByTypeNum(Collection<AnswerSheetPo> answerSheetsByTypeNum) {
        this.answerSheetsByTypeNum = answerSheetsByTypeNum;
    }
}
