/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import javax.swing.JTextField;
import com.sun.glass.events.KeyEvent;
/**
 *
 * @author Juanca
 */


public class mantenimiento {
    
//VALIDACIONES
    public void sololetras(JTextField txt, java.awt.event.KeyEvent evt){
        Character c=evt.getKeyChar();
        
        if(!Character.isLetter(c) && c !=evt.VK_SPACE){
            evt.consume();
        
        }
    }
    
    public void solonumeros(JTextField txt, java.awt.event.KeyEvent evt){
        Character c=evt.getKeyChar();
        
        if(!Character.isDigit(c) && c !=evt.VK_MINUS){
            evt.consume();
        }
    }
    
}
