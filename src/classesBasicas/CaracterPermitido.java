/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesBasicas;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author ELAINE
 */
public class CaracterPermitido extends PlainDocument {
   
    @Override
    public void insertString (int offset, String str, javax.swing.text.AttributeSet attr)
            throws BadLocationException{
     
        super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ ]", ""), attr);
    }
    
    
     public void replace (int offset, String str, javax.swing.text.AttributeSet attr)
            throws BadLocationException{
       
        super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ ]", ""), attr);
        
}
}