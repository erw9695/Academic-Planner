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
    
    public void addCourseBlock(int xCoord, int yCoord) {
        
    }
    
    // Must override this to paint.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (CourseBlock x : blocks) {
            x.create(g);
        }
    }
    
    
}
