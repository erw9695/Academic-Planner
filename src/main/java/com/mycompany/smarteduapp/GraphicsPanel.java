package com.mycompany.smarteduapp;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author ethan
 */
public class GraphicsPanel extends JPanel {
    // Collection of class blocks on the calendar.
    ArrayList<CourseBlock> blocks;
    HashSet<String> courses;
    
    GraphicsPanel() {
        blocks = new ArrayList();
        courses = new HashSet();
    }
    
    // Identify if a time conflict exists.
    public boolean conflictExists(CourseBlock newBlock) {
        double startTime = newBlock.startDigit;
        double endTime = newBlock.endDigit;
        
        for (CourseBlock x : blocks) {
            boolean cond1 = x.startDigit > startTime && x.startDigit < endTime;
            boolean cond2 = x.endDigit > startTime && x.endDigit < endTime;
            boolean cond3 = x.startDigit > startTime && x.endDigit < endTime;
            boolean cond4 = x.startDigit < startTime && x.endDigit > endTime;
            return cond1 || cond2 || cond3 || cond4;
        }
        
        return false;
    }
    
    // Add a new course to the panel.
    public void addCourse(CourseBlock course, String courseTitle) {
        blocks.add(course);
        courses.add(courseTitle);
    }
    
    // Must override this to paint.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("Repainting.");
        for (CourseBlock x : blocks) {
            x.create(g);
        }
    }
    
    
}
