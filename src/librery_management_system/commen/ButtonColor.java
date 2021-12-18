/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librery_management_system.commen;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author geeth
 */
public class ButtonColor {
   public static void buttonHiliter(JButton button){
       button.setBackground(Color.BLUE);
   } 
   public static void defaultColor(JButton button){
        button.setBackground(new Color(0,102,204));
   }
}
