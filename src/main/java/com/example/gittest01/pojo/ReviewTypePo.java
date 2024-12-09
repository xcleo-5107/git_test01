package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "review_type", schema = "git_test01", catalog = "")
public class ReviewTypePo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "type_num")
    private String typeNum;
    @Basic
    @Column(name = "type_name")
    private String typeName;
    @OneToMany(mappedBy = "reviewTypeByReviewType")
    private Collection<CoursesPo> coursesByTypeNum;

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
        ReviewTypePo that = (ReviewTypePo) o;
        return Objects.equals(typeNum, that.typeNum) && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeNum, typeName);
    }

    public Collection<CoursesPo> getCoursesByTypeNum() {
        return coursesByTypeNum;
    }

    public void setCoursesByTypeNum(Collection<CoursesPo> coursesByTypeNum) {
        this.coursesByTypeNum = coursesByTypeNum;
    }
}
