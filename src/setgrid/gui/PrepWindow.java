/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgrid.gui;

import java.io.IOException;

/**
 *
 * @author Ryan
 */
public class PrepWindow {
    
    public static void  toFront () {
        Runtime runTime = Runtime.getRuntime();
        try {
            Process process = runTime.exec("wscript C:\\setFocus.vbs");
           Thread.sleep (100);
            
        } catch (IOException | InterruptedException ex) {
        
        }
    }
    
    
    
}
