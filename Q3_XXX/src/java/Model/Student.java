/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student {
    private String studentId;
    private String studentName;
    private Date birthDate;
    private boolean gender;
    private String majorId;
    private String majorName;

    public Student(String studentId, String studentName, Date birthDate, boolean gender, String majorId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.majorId = majorId;
    }

    public Student(String studentId, String studentName, Date birthDate, boolean gender, String majorId, String majorName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.majorId = majorId;
        this.majorName = majorName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", birthDate=" + birthDate + ", gender=" + gender + ", majorId=" + majorId + ", majorName=" + majorName + '}';
    }
    
    
}
