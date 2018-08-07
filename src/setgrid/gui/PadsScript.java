/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgrid.gui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 *
 * @author Ryan
 */
public class PadsScript {
     
    //PadsScript.toFront();
    //static boolean status;
    
    public static void setGrid(String grid) {

        PrepWindow.toFront();

        try {
            
            Robot robot = new Robot();

            //robot.delay(100);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_G);

            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection strSel = new StringSelection(grid);
            clipboard.setContents(strSel, null);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
          
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
     
        } catch (AWTException e) {

        }
    }
    
    public static void setDisplay(char display) {

        PrepWindow.toFront();
        //System.out.println(status);
        //boolean status = false;

        try {

            Robot robot = new Robot();

            //robot.delay(50);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(display);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.keyRelease(display);

            //status = true;
            //System.out.println(status);

        } catch (AWTException ex) {

        }
    }

    public static void closeDisplay() {

        try {
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);

            //status = false;
        } catch (AWTException ex) {

        }

    }
    
    public static void setTools (char t1, char t2) {
        
        PrepWindow.toFront();
        
        try {
            Robot robot = new Robot();
            
            robot.delay (500);
             
            robot.keyPress(KeyEvent.VK_ALT);
            robot.delay (1000);
            
            
            robot.keyPress(t1);
            robot.keyRelease(t1);
            
             robot.delay (500);
            
            robot.keyPress(t2);
            robot.keyRelease(t2);
             
            robot.keyRelease(KeyEvent.VK_ALT);
                    
            
        } catch (AWTException ex) {
            
        }
     }  
     public static void setTools () {
         
         PrepWindow.toFront();
        
        try {
            Robot robot = new Robot();
             
            robot.keyPress(KeyEvent.VK_ALT);
            robot.delay (1000);
            
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            
            robot.keyRelease(KeyEvent.VK_ALT);
            
        }catch (AWTException ex) {
            
        }
     }
}

//    private static class toFront {
//
//        public toFront() {
//            
//            Runtime runTime = Runtime.getRuntime();
//        try {
//            Process process = runTime.exec("wscript D:\\NetBeansProjects\\Java\\JavaProjects\\SetGrid\\src\\setgrid\\gui\\setFocus.vbs");
//            Thread.sleep (500);
//            
//        } catch (IOException|InterruptedException ex) {
//        
//        } 
//            
//            
//            
//            
//        }
//    }

