package com.mycompany.smarteduapp;
import java.awt.*;

/**
 *
 * @author ethan
 */
public class CourseBlock {
    String courseTitle, location, startTime, endTime;
    double startDigit,endDigit;
    int blockWidth = 130;
    int blockHeight = 45;
    Color courseColor;
    
    CourseBlock(String courseText, String locText, String start, String end, Color colorVal) {
        courseTitle = courseText;
        location = locText;
        startTime = start;
        endTime = end;
        courseColor = colorVal;
        
        // Convert start time into int values.
        String[] startArr = startTime.split(":");
        
        int startHours = Integer.parseInt(startArr[0]);
        int startMinutes = Integer.parseInt(startArr[1]);
        if (startMinutes == 0) {
            startDigit = startHours;
        } else if (startMinutes < 30) { 
        // Round to nearest half hour.
            startDigit = startHours+0.5;
        } else {
        // Round to nearest hour.
            startDigit = startHours+1;
        }
        
        // Convert end time into int values.
        String[] endArr = endTime.split(":");
        
        int endHours = Integer.parseInt(endArr[0]);
        int endMinutes = Integer.parseInt(endArr[1]);
        if (endMinutes == 0) {
            endDigit = endHours;
        } else if (endMinutes <= 30) {
        // Round to nearest half hour.
            endDigit = endHours+0.5;
        } else {
        // Round to nearest hour.
            endDigit = endHours+1;
        }
    }
    
    // Create the block on graphics panel representing class.
    public void create(Graphics g) {
        g.setColor(courseColor);
        g.fillRect(0,(int)(startDigit-8)*blockHeight,blockWidth,(int)(endDigit-startDigit)*blockHeight);
        
        g.setColor(Color.white);
        g.drawString(courseTitle, blockHeight/4, (int)(startDigit-8)*blockHeight+12);
        g.drawString(location, blockHeight/4, (int)(startDigit-8)*blockHeight+24);
        g.drawString(startTime+" - "+endTime, blockHeight/4, (int)(startDigit-8)*blockHeight+36);
    }
}
