/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class StudentDAO extends DBContext {
    public ArrayList<String> getStudentId(){
        ArrayList<String> result = new ArrayList<>();
        
        String sql = "Select StudentID from Students";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String studentId = rs.getString("StudentID");
                result.add(studentId);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public Student getStudentInfoById(String searchId){
        String sql = "Select * from Students s,Major m where StudentID = ? and s.MajorID = m.MajorID";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, searchId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String studentId = rs.getString("StudentID");
                String studentName = rs.getString("StudentName");
                Date BirthDate = rs.getDate("BirthDate");
                boolean gender = rs.getBoolean("Gender");
                String majorId = rs.getString("MajorID");
                String majorName = rs.getString("MajorName");
                return new Student(studentId, studentName, BirthDate, gender, majorId, majorName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<Student> findByMajorId(String majorId){
        ArrayList<Student> result = new ArrayList<>();
        String sql = "Select * from Students s,Major m where s.MajorID = ? and s.MajorID = m.MajorID";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, majorId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String studentId = rs.getString("StudentID");
                String studentName = rs.getString("StudentName");
                Date BirthDate = rs.getDate("BirthDate");
                boolean gender = rs.getBoolean("Gender");
                String majorName = rs.getString("MajorName");
                result.add(new Student(studentId, studentName, BirthDate, gender, majorId, majorName));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public static void main(String[] args) {
        StudentDAO test = new StudentDAO();
        System.out.println(test.getStudentId());
        System.out.println(test.getStudentInfoById("BA05003"));
        System.out.println(test.findByMajorId("BA"));
    }
}
