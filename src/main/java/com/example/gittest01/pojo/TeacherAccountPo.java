package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "teacher_account", schema = "git_test01", catalog = "")
public class TeacherAccountPo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "account_num")
    private String accountNum;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password_")
    private String password;
    @Basic
    @Column(name = "teacher_num")
    private String teacherNum;
    @ManyToOne
    @JoinColumn(name = "teacher_num", referencedColumnName = "teacher_num")
    private TeachersPo teachersByTeacherNum;

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        TeacherAccountPo that = (TeacherAccountPo) o;
        return Objects.equals(accountNum, that.accountNum) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(teacherNum, that.teacherNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNum, username, password, teacherNum);
    }

    public TeachersPo getTeachersByTeacherNum() {
        return teachersByTeacherNum;
    }

    public void setTeachersByTeacherNum(TeachersPo teachersByTeacherNum) {
        this.teachersByTeacherNum = teachersByTeacherNum;
    }
}
