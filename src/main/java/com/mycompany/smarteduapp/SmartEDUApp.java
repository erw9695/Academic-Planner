package com.mycompany.smarteduapp;

import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author ethan
 */
public class SmartEDUApp {
    static MainScreen main;
    static AssignmentScreen assign;
    
    public static void main(String[] args) {
        
        // Create local directory if needed.
        File file = new File(".\\smartEDUFiles");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Main directory created.");
            } else {
                System.out.println("Main directory creation failure.");
            }
        } else {
            System.out.println("Main directory ALREADY exists.");
        }
        
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
                HashMap<String,Boolean> dayBool = new HashMap();
                HashMap<String,GraphicsPanel> dayPanel = new HashMap();
                        
                String courseTitle = rs.getString("courseTitle");
                String location = rs.getString("location");
                dayBool.put("MON",rs.getBoolean("monClass"));
                dayBool.put("TUE",rs.getBoolean("tueClass"));
                dayBool.put("WED",rs.getBoolean("wedClass"));
                dayBool.put("THU",rs.getBoolean("thuClass"));
                dayBool.put("FRI",rs.getBoolean("friClass"));
                dayBool.put("SAT",rs.getBoolean("satClass"));
                dayBool.put("SUN",rs.getBoolean("sunClass"));
                
                dayPanel.put("MON",SmartEDUApp.main.gPanMon);
                dayPanel.put("TUE",SmartEDUApp.main.gPanTue);
                dayPanel.put("WED",SmartEDUApp.main.gPanWed);
                dayPanel.put("THU",SmartEDUApp.main.gPanThu);
                dayPanel.put("FRI",SmartEDUApp.main.gPanFri);
                dayPanel.put("SAT",SmartEDUApp.main.gPanSat);
                dayPanel.put("SUN",SmartEDUApp.main.gPanSun);
                /*Boolean monClass = rs.getBoolean("monClass");
                Boolean tueClass = rs.getBoolean("tueClass");
                Boolean wedClass = rs.getBoolean("wedClass");
                Boolean thuClass = rs.getBoolean("thuClass");
                Boolean friClass = rs.getBoolean("friClass");
                Boolean satClass = rs.getBoolean("satClass");
                Boolean sunClass = rs.getBoolean("sunClass");*/
                String startTime = rs.getString("startTime");
                String endTime = rs.getString("endTime");
                int rVal = rs.getInt("rVal");
                int gVal = rs.getInt("gVal");
                int bVal = rs.getInt("bVal");
                Color courseColor = new Color(rVal,gVal,bVal);
                
                for (String day : dayBool.keySet()) {
                    GraphicsPanel panel = dayPanel.get(day);
                    if (dayBool.get(day)) {
                        panel.addCourse(new CourseBlock(courseTitle,location,startTime,endTime,courseColor),courseTitle);
                        panel.repaint();
                    }
                }
                
                /*
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
                */
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (rs != null) try { rs.close(); } catch (Exception e2) {}
            if (state != null) try { state.close(); } catch (Exception e3) {}
            if (conn != null) try { conn.close(); } catch (Exception e4) {}
        }
    }
}
