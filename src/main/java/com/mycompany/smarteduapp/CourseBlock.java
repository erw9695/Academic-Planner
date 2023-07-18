/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smarteduapp;
import java.awt.*;
import java.util.*;

/**
 *
 * @author ethan
 */
public class CourseBlock {
    String courseTitle, location, startTime, endTime;
    double startDigit,endDigit;
    int blockWidth = 130;
    int blockHeight = 15;
    Color courseColor;
    
    CourseBlock(String courseText, String locText, String start, String end, Color colorVal) {
        courseTitle = courseText;
        location = locText;
        startTime = start;
        endTime = end;
        courseColor = colorVal;
        
        String[] startArr = startTime.split(":");
        
        int startHours = Integer.parseInt(startArr[0]);
        int startMinutes = Integer.parseInt(startArr[1]);
        if (startMinutes == 0) {
            startDigit = startHours;
        } else if (startMinutes < 30) {
            startDigit = startHours+0.5;
        } else {
            startDigit = startHours+1;
        }
        
        String[] endArr = endTime.split(":");
        
        int endHours = Integer.parseInt(endArr[0]);
        int endMinutes = Integer.parseInt(endArr[1]);
        if (endMinutes == 0) {
            endDigit = endHours;
        } else if (endMinutes <= 30) {
            endDigit = endHours+0.5;
        } else {
            endDigit = endHours+1;
        }
    }
    
    public void create(Graphics g) {
        g.setColor(courseColor);
        g.fillRect(0,(int)(startDigit-8)*30,130,(int)(endDigit-startDigit)*30);
        
        g.setColor(Color.white);
        g.drawString(courseTitle, 30, (int)(startDigit-8)*30+12);
        g.drawString(location, 30, (int)(startDigit-8)*30+24);
        g.drawString(startTime+" - "+endTime, 30, (int)(startDigit-8)*30+36);
    }
}
