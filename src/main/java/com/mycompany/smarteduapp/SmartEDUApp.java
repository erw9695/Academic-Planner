package com.mycompany.smarteduapp;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ethan
 */
public class SmartEDUApp {
    static MainScreen main;
    static AssignmentScreen assign;
    
    public static void main(String[] args) {
        main = new MainScreen();
        main.setVisible(true);
        
        assign = new AssignmentScreen();
        
        // Load from DB.
        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;
        
        try {
            String url = "jdbc:mariadb://localhost:3307/academicdb";
            conn = DriverManager.getConnection(url,"root","");
            
            String queryCourses = "select * from schedule";
           
            state = conn.createStatement();
            rs = state.executeQuery(queryCourses);
            
            while (rs.next()) {
                String courseTitle = rs.getString("courseTitle");
                String location = rs.getString("location");
                Boolean monClass = rs.getBoolean("monClass");
                Boolean tueClass = rs.getBoolean("tueClass");
                Boolean wedClass = rs.getBoolean("wedClass");
                Boolean thuClass = rs.getBoolean("thuClass");
                Boolean friClass = rs.getBoolean("friClass");
                Boolean satClass = rs.getBoolean("satClass");
                Boolean sunClass = rs.getBoolean("sunClass");
                String startTime = rs.getString("startTime");
                String endTime = rs.getString("endTime");
                int rVal = rs.getInt("rVal");
                int gVal = rs.getInt("gVal");
                int bVal = rs.getInt("bVal");
                Color courseColor = new Color(rVal,gVal,bVal);
                
                if (monClass) {
                    SmartEDUApp.main.gPanMon.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                    SmartEDUApp.main.gPanMon.repaint();
                }
                if (tueClass) {
                    SmartEDUApp.main.gPanTue.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                    SmartEDUApp.main.gPanTue.repaint();
                }
                if (wedClass) {
                    SmartEDUApp.main.gPanWed.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                    SmartEDUApp.main.gPanWed.repaint();
                }
                if (thuClass) {
                    SmartEDUApp.main.gPanThu.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                    SmartEDUApp.main.gPanThu.repaint();
                } 
                if (friClass) {
                    SmartEDUApp.main.gPanFri.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                    SmartEDUApp.main.gPanFri.repaint();
                }
                if (satClass) {
                    SmartEDUApp.main.gPanSat.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                    SmartEDUApp.main.gPanSat.repaint();
                }
                if (sunClass) {
                    SmartEDUApp.main.gPanSun.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                    SmartEDUApp.main.gPanSun.repaint();
                }
            }
        } catch (Exception e) {
            
        } finally {
            if (rs != null) try { rs.close(); } catch (Exception e2) {}
            if (state != null) try { state.close(); } catch (Exception e3) {}
            if (conn != null) try { conn.close(); } catch (Exception e4) {}
        }
    }
}
