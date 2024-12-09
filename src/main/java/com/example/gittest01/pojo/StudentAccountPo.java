package com.example.gittest01.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "student_account", schema = "git_test01", catalog = "")
public class StudentAccountPo {
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
    @Column(name = "student_id")
    private String studentId;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private StudentsPo studentsByStudentId;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentAccountPo that = (StudentAccountPo) o;
        return Objects.equals(accountNum, that.accountNum) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNum, username, password, studentId);
    }

    public StudentsPo getStudentsByStudentId() {
        return studentsByStudentId;
    }

    public void setStudentsByStudentId(StudentsPo studentsByStudentId) {
        this.studentsByStudentId = studentsByStudentId;
    }
}
